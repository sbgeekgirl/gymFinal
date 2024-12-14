DROP TABLE IF EXISTS exercise_category;
DROP TABLE IF EXISTS  categories;
DROP TABLE IF EXISTS entries;
DROP TABLE IF EXISTS exercises;
DROP TABLE IF EXISTS users;

CREATE TABLE users(
	user_id int NOT NULL AUTO_INCREMENT,
	user_first_name varchar(40),
	user_last_name varchar(40),
	PRIMARY KEY (user_id)
);

CREATE TABLE exercises(
	exercise_id int NOT NULL AUTO_INCREMENT,
	exercise_name varchar(128),
	exercise_description varchar(512),
	exercise_equipment varchar(128),
	PRIMARY KEY (exercise_id)
);

CREATE TABLE categories(
	category_id int NOT NULL AUTO_INCREMENT,
	category_name varchar(128),
    PRIMARY KEY (category_id)
);

CREATE TABLE entries(
	entry_id int NOT NULL AUTO_INCREMENT,
	reps int,
	rounds int, 
	wgt int, 
	user_id int NOT NULL,
	exercise_id int NOT NULL,
	PRIMARY KEY (entry_id),
	FOREIGN KEY (user_id) REFERENCES users (user_id) ON DELETE CASCADE,
	FOREIGN KEY (exercise_id) REFERENCES exercises (exercise_id) ON DELETE CASCADE
);
    
CREATE TABLE exercise_category(
	exercise_id int NOT NULL,
	category_id int NOT NULL,
	FOREIGN KEY (exercise_id) REFERENCES exercises (exercise_id) ON DELETE CASCADE,
	FOREIGN KEY (category_id) REFERENCES categories (category_id) ON DELETE CASCADE
);