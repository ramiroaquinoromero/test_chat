create database chat_application;


use chat_application;


create table user(
	id int auto_increment PRIMARY KEY,
	name VARCHAR(40) NOT NULL,
	last_name VARCHAR(40) NOT NULL,
	mail VARCHAR(60),
	username VARCHAR(30) NOT NULL,
	password VARCHAR(80) NOT NULL,
	created_at datetime DEFAULT NOW(),
	updated_at datetime DEFAULT NULL
);

create table message(
	id BIGINT auto_increment PRIMARY KEY,
	text TEXT NOT null,
	created_at datetime DEFAULT NOW()
);

create table conversation(
	id BIGINT auto_increment PRIMARY KEY,
	user_sender INT NOT NULL,
	user_receiving INT NOT NULL,
	status ENUM('SEND', 'DELIVER', 'READ', 'DELETED') DEFAULT 'SEND',
	message_id BIGINT NOT NULL,
	FOREIGN KEY(user_sender) REFERENCES user(id),
	FOREIGN KEY(user_receiving) REFERENCES user(id),
	FOREIGN KEY(message_id) REFERENCES message(id)
);

select * from user;

select * from message;

select * from conversation;