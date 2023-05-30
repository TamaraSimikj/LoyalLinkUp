import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BusinessComponent } from './components/business/business.component';
import { ClientListComponent } from './components/client-list/client-list.component';
import { EventsPageComponent } from './components/events-page/events-page.component';

const routes: Routes = [
  {path: 'business/:name', component: BusinessComponent},
  {path: 'events', component: EventsPageComponent},
  {path: 'test', component: ClientListComponent},
  {path: '', redirectTo: '/events', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
