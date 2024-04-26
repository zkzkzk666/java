--
-- ER/Studio 8.0 SQL Code Generation
-- Company :      1
-- Project :      Model1.DM1
-- Author :       1
--
-- Date Created : Thursday, June 15, 2023 20:57:17
-- Target DBMS : MySQL 5.x
--

-- 
-- TABLE: Admin 
--

CREATE TABLE Admin(
    adminId      CHAR(2)        NOT NULL,
    adminName    VARCHAR(20)    NOT NULL,
    password     VARCHAR(20)    NOT NULL,
    PRIMARY KEY (adminId)
)ENGINE=INNODB
;



-- 
-- TABLE: Album 
--

CREATE TABLE Album(
    albumId      CHAR(3)        NOT NULL,
    albumName    VARCHAR(20)    NOT NULL,
    singerId     CHAR(4)        NOT NULL,
    PRIMARY KEY (albumId)
)ENGINE=INNODB
;



-- 
-- TABLE: Notice 
--

CREATE TABLE Notice(
    noticeId         CHAR(3)          NOT NULL,
    noticeContent    VARCHAR(1000),
    releaseTime      VARCHAR(20)      NOT NULL,
    adminId          CHAR(2)          NOT NULL,
    PRIMARY KEY (noticeId)
)ENGINE=INNODB
;



-- 
-- TABLE: Singer 
--

CREATE TABLE Singer(
    singerId      CHAR(4)        NOT NULL,
    gender        VARCHAR(10)    NOT NULL,
    singerName    VARCHAR(20)    NOT NULL,
    repSong       VARCHAR(30)    NOT NULL,
    repAlbum      VARCHAR(30)    NOT NULL,
    birthday      CHAR(4)        NOT NULL,
    styleId       CHAR(2)        NOT NULL,
    PRIMARY KEY (singerId)
)ENGINE=INNODB
;



-- 
-- TABLE: Song 
--

CREATE TABLE Song(
    songId      CHAR(3)        NOT NULL,
    songName    VARCHAR(30)    NOT NULL,
    singerId    CHAR(4)        NOT NULL,
    styleId     CHAR(2)        NOT NULL,
    albumId     CHAR(3)        NOT NULL,
    PRIMARY KEY (songId)
)ENGINE=INNODB
;



-- 
-- TABLE: Style 
--

CREATE TABLE Style(
    styleId      CHAR(2)        NOT NULL,
    styleName    VARCHAR(20)    NOT NULL,
    PRIMARY KEY (styleId)
)ENGINE=INNODB
;



-- 
-- TABLE: User 
--

CREATE TABLE User(
    userId      CHAR(2)        NOT NULL,
    userName    VARCHAR(20)    NOT NULL,
    password    VARCHAR(20)    NOT NULL,
    PRIMARY KEY (userId)
)ENGINE=INNODB
;



-- 
-- TABLE: Album 
--

ALTER TABLE Album ADD CONSTRAINT RefSinger3 
    FOREIGN KEY (singerId)
    REFERENCES Singer(singerId)
;


-- 
-- TABLE: Notice 
--

ALTER TABLE Notice ADD CONSTRAINT RefAdmin18 
    FOREIGN KEY (adminId)
    REFERENCES Admin(adminId)
;


-- 
-- TABLE: Singer 
--

ALTER TABLE Singer ADD CONSTRAINT RefStyle17 
    FOREIGN KEY (styleId)
    REFERENCES Style(styleId)
;


-- 
-- TABLE: Song 
--

ALTER TABLE Song ADD CONSTRAINT RefStyle6 
    FOREIGN KEY (styleId)
    REFERENCES Style(styleId)
;

ALTER TABLE Song ADD CONSTRAINT RefAlbum8 
    FOREIGN KEY (albumId)
    REFERENCES Album(albumId)
;

ALTER TABLE Song ADD CONSTRAINT RefSinger13 
    FOREIGN KEY (singerId)
    REFERENCES Singer(singerId)
;


