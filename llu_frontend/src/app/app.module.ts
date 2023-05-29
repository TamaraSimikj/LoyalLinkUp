import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {HttpClientModule} from "@angular/common/http";
import { ClientListComponent } from './components/client-list/client-list.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { EventsPageComponent } from './components/events-page/events-page.component';


@NgModule({
  declarations: [
    AppComponent,
    ClientListComponent,
    NavbarComponent,
    EventsPageComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
