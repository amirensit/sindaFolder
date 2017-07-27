"use strict";
var home_component_1 = require('./utilisateur/home.component');
var role_component_1 = require('./role/role.component');
var icons_component_1 = require('./icons/icons.component');
var table_component_1 = require('./table/table.component');
var notifications_component_1 = require('./notifications/notifications.component');
var typography_component_1 = require('./typography/typography.component');
var maps_component_1 = require('./maps/maps.component');
var upgrade_component_1 = require('./upgrade/upgrade.component');
var login_component_1 = require("../login/login.component");
var auth_guard_1 = require("../guards/auth.guard");
exports.MODULE_ROUTES = [
    { path: 'login', component: login_component_1.LoginComponent },
    { path: 'utilisateurs', component: home_component_1.HomeComponent, canActivate: [auth_guard_1.AuthGuard] },
    { path: 'roles', component: role_component_1.RoleComponent, canActivate: [auth_guard_1.AuthGuard] },
    { path: 'table', component: table_component_1.TableComponent, canActivate: [auth_guard_1.AuthGuard] },
    { path: 'icons', component: icons_component_1.IconsComponent, canActivate: [auth_guard_1.AuthGuard] },
    { path: 'notifications', component: notifications_component_1.NotificationsComponent, canActivate: [auth_guard_1.AuthGuard] },
    { path: 'typography', component: typography_component_1.TypographyComponent, canActivate: [auth_guard_1.AuthGuard] },
    { path: 'maps', component: maps_component_1.MapsComponent, canActivate: [auth_guard_1.AuthGuard] },
    { path: 'upgrade', component: upgrade_component_1.UpgradeComponent, canActivate: [auth_guard_1.AuthGuard] },
    { path: '', redirectTo: 'login', pathMatch: 'full', canActivate: [auth_guard_1.AuthGuard] }
];
exports.MODULE_COMPONENTS = [
    login_component_1.LoginComponent,
    home_component_1.HomeComponent,
    role_component_1.RoleComponent,
    table_component_1.TableComponent,
    icons_component_1.IconsComponent,
    notifications_component_1.NotificationsComponent,
    typography_component_1.TypographyComponent,
    maps_component_1.MapsComponent,
    upgrade_component_1.UpgradeComponent
];
//# sourceMappingURL=dashboard.routes.js.map