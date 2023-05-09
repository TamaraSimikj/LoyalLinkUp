import { Business } from "./business"

export interface Event {
    id: number,
    name: string,
    date_time: Date,
    type: string,
    capacity: number,
    business: Business
}