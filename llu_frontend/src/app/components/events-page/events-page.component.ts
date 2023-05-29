import { Component, OnInit } from '@angular/core';
import { BehaviorSubject, Observable, switchMap } from 'rxjs';
import { Address } from 'src/app/interfaces/address';
import { Event } from 'src/app/interfaces/event';
import { AddressService } from 'src/app/services/address.service';
import { EventService } from 'src/app/services/event.service';

@Component({
  selector: 'app-events-page',
  templateUrl: './events-page.component.html',
  styleUrls: ['./events-page.component.css']
})
export class EventsPageComponent implements OnInit {

  addresses! : Address[]
  typeOfEvents! : String[]
  events$! : Observable<Event[]>

  subject$ = new BehaviorSubject<boolean>(true)

  constructor(private addressService: AddressService,private eventService: EventService) { }

  ngOnInit(): void {

    this.getAllAddresses()
    this.getAllTypeOfEvents()
    this.getAllEvents()

  }

  getAllAddresses(): void{
    this.addressService.getAllAddresses().subscribe((data) => {
      this.addresses = data
    })
  }

  getAllTypeOfEvents() {
    this.eventService.getAllTypeOfEvents().subscribe(data => {
      this.typeOfEvents = data
    })
  }

  getAllEvents() {
    this.events$ = this.subject$.pipe(switchMap(_ =>  this.eventService.getAllEvents()))
  }
}
