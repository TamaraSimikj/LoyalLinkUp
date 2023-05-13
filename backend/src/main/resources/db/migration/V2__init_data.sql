insert into clients(name,surname,phone_number) values
                                                   ('Damjan','Boskovski','075447837'),
                                                   ('Marija','Siljanovska','072312322'),
                                                   ('Monika','Svilanovikj','075123432'),
                                                   ('Tamara','Simikj','078321932'),
                                                   ('Donce','Bojcev','075213332');


insert into businesses(name,phone_number,address,type_of_business) values
                                                                       ('Nadzak','023128113','Orce Nikolov 105', 'RESTAURANT'),
                                                                       ('Netaville','021343321','Nikola Tesla 9', 'CAFFE'),
                                                                       ('Public Room','023122233','50-ta Divizija', 'BAR');


insert into events(name,date_time,type_of_event,capacity,business_id) values
                                                                          ('Retro 80s party','01.01.2023', 'THEME_PARTY', 100, 2),
                                                                          ('Retro 90s party','02.01.2023', 'AFTERPARTY', 100, 3),
                                                                          ('Easy family brunch!','10.01.2023', 'BRUNCH', 50, 1);