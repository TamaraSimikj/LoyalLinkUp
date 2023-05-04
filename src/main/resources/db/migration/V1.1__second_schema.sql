CREATE TABLE if not exists events
(
    event_id bigserial primary key,
    name    text,
    date_time timestamp,
    type_of_event text,
    capacity int,
    business_id bigserial,
    constraint business_fk
        foreign key (business_id) references businesses(business_id) on delete set null
);


CREATE TABLE if not exists reviews
(
    review_id bigserial primary key,
    date_time timestamp,
    comment text,
    grade int
);
