DROP DATABASE IF EXISTS ShortBlogging;
DROP USER IF EXISTS b_user;

USE mysql;
CREATE DATABASE ShortBlogging DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci;
CREATE USER 'b_user'@'%' IDENTIFIED BY 'pass';
GRANT ALL ON ShortBlogging.* TO 'b_user'@'%';
FLUSH PRIVILEGES;
