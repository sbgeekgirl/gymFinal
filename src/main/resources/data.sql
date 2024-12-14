INSERT INTO users (user_first_name, user_last_name) VALUES ("User", "One");
INSERT INTO users (user_first_name, user_last_name) VALUES ("Person", "Two");
INSERT INTO users (user_first_name, user_last_name) VALUES ("GymRAT", "Three");

INSERT INTO exercises (exercise_name, exercise_description, exercise_equipment) VALUES ("Bench Press", "Lay on a bench and lift bar from chest", "Barbell");
INSERT INTO exercises (exercise_name, exercise_description, exercise_equipment) VALUES ("Jump Rope", "Swing rope over your head and jump over it as it comes down to your feet", "Jump Rope");
INSERT INTO exercises (exercise_name, exercise_description, exercise_equipment) VALUES ("Squats", "From standing position, bend knees and lower butt to a sitting position and stand back up", "Wall");
	
INSERT INTO categories (category_name) VALUES ("Legs");
INSERT INTO categories (category_name) VALUES ("Shoulders");
INSERT INTO categories (category_name) VALUES ("Arms");
INSERT INTO categories (category_name) VALUES ("Core");
INSERT INTO categories (category_name) VALUES ("Cardio");

INSERT INTO entries (reps, rounds, wgt, user_id, exercise_id) VALUES (10, 3, 50, 1, 1);
INSERT INTO entries (reps, rounds, wgt, user_id, exercise_id) VALUES (10, 3, 40, 2, 1);
INSERT INTO entries (reps, rounds, wgt, user_id, exercise_id) VALUES (10, 3, 150, 3, 1);
INSERT INTO entries (reps, rounds, wgt, user_id, exercise_id) VALUES (10, 3, 50, 1, 1);
INSERT INTO entries (reps, rounds, wgt, user_id, exercise_id) VALUES (100, 1, 0, 1, 2);
INSERT INTO entries (reps, rounds, wgt, user_id, exercise_id) VALUES (10, 3, 0, 1, 3);
INSERT INTO entries (reps, rounds, wgt, user_id, exercise_id) VALUES (10, 3, 10, 2, 3);
INSERT INTO entries (reps, rounds, wgt, user_id, exercise_id) VALUES (10, 3, 50, 3, 3);
INSERT INTO entries (reps, rounds, wgt, user_id, exercise_id) VALUES (10, 3, 50, 1, 1);