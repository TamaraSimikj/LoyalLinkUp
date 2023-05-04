CREATE TABLE if not exists clients
(
    client_id bigserial primary key,
    name    text,
    surname text,
    phone_number varchar
);

CREATE TABLE if not exists businesses
(
    business_id bigserial primary key,
    name    text,
    address text,
    phone_number varchar,
    type_of_business text
);

