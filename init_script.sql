-- create database
CREATE DATABASE IF NOT EXISTS filter_fleet;
USE filter_fleet;

-- create team table
CREATE TABLE teams (
  team_id int PRIMARY KEY AUTO_INCREMENT,
  team_name VARCHAR(255)
);

-- create member table
CREATE TABLE members (
   member_id int PRIMARY KEY AUTO_INCREMENT,
   team_id int,
   member_name VARCHAR(255),
   FOREIGN KEY (team_id) REFERENCES teams(team_id)
);

-- insert team
INSERT INTO teams (team_name) VALUES ('Team Green');
INSERT INTO teams (team_name) VALUES ('Team Blue');
INSERT INTO teams (team_name) VALUES ('Team Red');

-- inser members
INSERT INTO members (team_id, member_name) VALUES (1, 'Shikha');
INSERT INTO members (team_id, member_name) VALUES (1, 'Rekha');
INSERT INTO members (team_id, member_name) VALUES (1, 'Max');

INSERT INTO members (team_id, member_name) VALUES (2, 'Priya');
INSERT INTO members (team_id, member_name) VALUES (2, 'Deepak');

INSERT INTO members (team_id, member_name) VALUES (3, 'Kritika');

