insert into BOB_SHOP(shop_id, shop_name, shop_x, shop_y, dst_frm_gfc_m, reg_id, reg_date, upd_id, upd_date)
values(null, 'ebayKo34F', 12.35, 15.55, 9, 'system', now(), 'system', now());

insert  into BOB_MENU(menu_id, menu_name, menu_price, shop_id, reg_id, reg_date, upd_id, upd_date)
values (null, '카페라떼', 0, 1, 'system', now(), 'system', now());

insert  into BOB_MENU(menu_id, menu_name, menu_price, shop_id, reg_id, reg_date, upd_id, upd_date)
values (null, '카푸치노', 0, 1, 'system', now(), 'system', now());

insert into BOB_THEME(seq, menu_id, theme_type, reg_id, reg_date, upd_id, upd_date)
values (null, 1, 3, 'system', now(), 'system', now());

insert into BOB_THEME(seq, menu_id, theme_type, reg_id, reg_date, upd_id, upd_date)
values (null, 1, 2, 'system', now(), 'system', now());

insert into BOB_USER(user_id, user_email, user_pass, reg_id, reg_date, upd_id, upd_date)
values (null, 'seunyang@ebay.com', '1234', 'system', now(), 'system', now());

insert into BOB_USER(user_id, user_email, user_pass, reg_id, reg_date, upd_id, upd_date)
values (null, 'minoh@ebay.com', '1234', 'system', now(), 'system', now());

insert into BOB_SPOON(spoon_id, user_id, menu_id, reg_id, reg_date)
values (null, 1, 1, 'system', now());

insert into BOB_SPOON(spoon_id, user_id, menu_id, reg_id, reg_date)
values (null, 2, 1, 'system', now());

insert into BOB_TAG(tag_id, user_id, menu_id, content, reg_id, reg_date)
values (null, 1, 1, '가성비갑', 'system', now());

insert into BOB_TAG(tag_id, user_id, menu_id, content, reg_id, reg_date)
values (null, 1, 1, '바닐라', 'system', now());

insert into BOB_TAG(tag_id, user_id, menu_id, content, reg_id, reg_date)
values (null, 1, 1, '카라멜', 'system', now());

insert into BOB_TAG(tag_id, user_id, menu_id, content, reg_id, reg_date)
values (null, 1, 2, '가성비갑', 'system', now());

insert into BOB_TAG(tag_id, user_id, menu_id, content, reg_id, reg_date)
values (null, 2, 1, '맛없어요', 'system', now());