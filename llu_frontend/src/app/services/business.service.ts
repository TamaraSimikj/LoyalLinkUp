import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, tap } from 'rxjs';
import { Business } from '../interfaces/business';

@Injectable({
  providedIn: 'root'
})
export class BusinessService {

  url = "api/business"

  constructor(private http: HttpClient) { }

  
  getAllBusinesses() : Observable<Business[]> {
    return this.http.get<Business[]>(this.url)
  }

  getBusinessById(id: number) : Observable<Business>{
    return this.http.get<Business>(this.url.concat(`/${id}`))
  }

  deleteBusinessById(id: number) : void{
    this.http.delete(this.url.concat(`/delete/${id}`)).subscribe()
  }


  createBusiness(business: Business): void {
    this.http.post(this.url.concat(`/add`), {
      name: business.name,
      address: business.address,
      phone_number: business.phone_number,
      type_of_business: business.type_of_business
    }).subscribe(data => {
      tap(data)
    })
  }

  editBusiness(id: number, business: Business): void {
    this.http.put(this.url.concat(`/edit/${id}`), {
      name: business.name,
      address: business.address,
      phone_number: business.phone_number,
      type_of_business: business.type_of_business
    }).subscribe(data => {
      tap(data)
    })
  }
}
