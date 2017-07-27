import { Route } from '@angular/router';
import { DashboardComponent } from './dashboard.component';
import { HomeComponent } from './utilisateur/home.component';
import { RoleComponent } from './role/role.component';
import { IconsComponent } from './icons/icons.component';
import { TableComponent } from './table/table.component';
import { NotificationsComponent } from './notifications/notifications.component';
import { TypographyComponent } from './typography/typography.component';
import { MapsComponent } from './maps/maps.component';
import { UpgradeComponent } from './upgrade/upgrade.component';
import {LoginComponent} from "../login/login.component";
import {AuthGuard} from "../guards/auth.guard";

export const MODULE_ROUTES: Route[] =[
    { path: 'login', component: LoginComponent },
    { path: 'utilisateurs', component: HomeComponent, canActivate: [AuthGuard] },
    { path: 'roles', component: RoleComponent , canActivate: [AuthGuard]},
    { path: 'table', component: TableComponent , canActivate: [AuthGuard]},
    { path: 'icons', component: IconsComponent , canActivate: [AuthGuard]},
    { path: 'notifications', component: NotificationsComponent , canActivate: [AuthGuard]},
    { path: 'typography', component: TypographyComponent , canActivate: [AuthGuard]},
    { path: 'maps', component: MapsComponent , canActivate: [AuthGuard]},
    { path: 'upgrade', component: UpgradeComponent, canActivate: [AuthGuard] },
    { path: '', redirectTo: 'login', pathMatch: 'full' , canActivate: [AuthGuard]}
]

export const MODULE_COMPONENTS = [
    LoginComponent,
    HomeComponent,
    RoleComponent,
    TableComponent,
    IconsComponent,
    NotificationsComponent,
    TypographyComponent,
    MapsComponent,
    UpgradeComponent
]
