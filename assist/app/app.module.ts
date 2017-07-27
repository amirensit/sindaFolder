import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule } from '@angular/router';
import { HttpModule } from '@angular/http';

import { AppComponent }   from './app.component';
import { DashboardComponent } from './dashboard/dashboard.component';

import { DashboardModule } from './dashboard/dashboard.module';
import { SidebarModule } from './sidebar/sidebar.module';
import { FooterModule } from './shared/footer/footer.module';
import { NavbarModule} from './shared/navbar/navbar.module';

import { HashLocationStrategy, LocationStrategy ,CommonModule} from '@angular/common';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {rolesService} from "./services/role.service";
import {utilisateursService} from "./services/utilisateur.service";
import {AuthenticationService} from "./services/authentication.service";
import {DataTableModule} from "angular2-datatable"; 
import { Ng2FilterPipeModule } from 'ng2-filter-pipe';
import {AuthGuard} from "./guards/auth.guard";
 

@NgModule({
    imports:      [
        Ng2FilterPipeModule,
        CommonModule,
        DataTableModule,
        HttpModule,
        FormsModule,
        ReactiveFormsModule,
        BrowserModule,
        DashboardModule,
        SidebarModule,
        NavbarModule,
        FooterModule,
        RouterModule.forRoot([])
    ],
    declarations: [ AppComponent, DashboardComponent ],
    providers: [{provide: LocationStrategy, useClass: HashLocationStrategy},rolesService,utilisateursService,AuthenticationService,AuthGuard],
    bootstrap:    [ AppComponent ]
})
export class AppModule { }
