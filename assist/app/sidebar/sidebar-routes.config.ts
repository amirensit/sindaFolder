import {  RouteInfo } from './sidebar.metadata';

export const ROUTES: RouteInfo[] = [
    { path: 'utilisateurs', title: 'Gestion des utiliateurs',  icon: 'person', class: '' },
    { path: 'roles', title: 'Gestion des roles',  icon:'dashboard', class: '' },
    { path: 'table', title: 'Table List',  icon:'content_paste', class: '' },
    { path: 'typography', title: 'Typography',  icon:'library_books', class: '' },
    { path: 'icons', title: 'Icons',  icon:'bubble_chart', class: '' },
    { path: 'maps', title: 'Maps',  icon:'location_on', class: '' },
    { path: 'notifications', title: 'Notifications',  icon:'notifications', class: '' },
    { path: 'upgrade', title: 'Upgrade to PRO',  icon:'unarchive', class: 'active-pro' },
];
