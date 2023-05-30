import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {RouterModule} from "@angular/router";
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {HttpClientModule} from "@angular/common/http";
import { ClientListComponent } from './components/client-list/client-list.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { EventsPageComponent } from './components/events-page/events-page.component';
import { BusinessComponent } from './components/business/business.component';
import { RemoveSpacesPipe } from './pipes/remove-spaces.pipe';
import { ReactiveFormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    ClientListComponent,
    NavbarComponent,
    EventsPageComponent,
    BusinessComponent,
    RemoveSpacesPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    RouterModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
