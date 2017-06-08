/*
SQLyog - Free MySQL GUI v5.19
Host - 5.0.15-nt : Database - sixdegrees
*********************************************************************
Server version : 5.0.15-nt
*/

SET NAMES utf8;

SET SQL_MODE='';

create database if not exists `sixdegrees`;

USE `sixdegrees`;

SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO';

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `email` varchar(100) default NULL,
  `pass` varchar(50) default NULL,
  `fname` varchar(50) default NULL,
  `lname` varchar(50) default NULL,
  `dob` varchar(50) default NULL,
  `role` varchar(50) default NULL,
  `phone` varchar(50) default NULL,
  `city` varchar(50) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `admin` */

insert into `admin` (`email`,`pass`,`fname`,`lname`,`dob`,`role`,`phone`,`city`) values ('chandana','chandana','chandana','s','15.10.92','Admin','452147822','BAngalore');

/*Table structure for table `allposts` */

DROP TABLE IF EXISTS `allposts`;

CREATE TABLE `allposts` (
  `src` varchar(100) default NULL,
  `dest` varchar(100) default NULL,
  `msg` varchar(600) default NULL,
  `status` varchar(100) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `allposts` */

insert into `allposts` (`src`,`dest`,`msg`,`status`) values ('geet.0988@rediff.com','shyam.t@gmail.com','hey how are you','posted'),('geet.0988@rediff.com','tina.roy@yahoo.com','yo bitch','blocked'),('geet.0988@rediff.com','shyam.t@gmail.com','BJP is bad','blocked'),('geet.0988@rediff.com','shyam.t@gmail.com','AAP is good','posted'),('geet.0988@rediff.com','shyam.t@gmail.com','stop pissing me off','blocked'),('geet.0988@rediff.com','tina.roy@yahoo.com','I am good how about you','posted'),('geet.0988@rediff.com','tina.roy@yahoo.com','kill yourself','blocked'),('geet.0988@rediff.com','tina.roy@yahoo.com','you should not think of killing yourself','posted'),('geet.0988@rediff.com','shyam.t@gmail.com','long time','posted'),('geet.0988@rediff.com','tina.roy@yahoo.com','xxx','blocked'),('shyam.t@gmail.com','tina.roy@yahoo.com','idiot','blocked'),('tina.roy@yahoo.com','geet.0988@rediff.com','bitch bjp idiot kill','blocked'),('tina.roy@yahoo.com','geet.0988@rediff.com','bitch bjp xxx','blocked'),('geet.0988@rediff.com','tina.roy@yahoo.com','bitch','blocked'),('geet.0988@rediff.com','tina.roy@yahoo.com','kill','blocked'),('geet.0988@rediff.com','tina.roy@yahoo.com','kill kill kill kill','blocked'),('tina.roy@yahoo.com','shyam.t@gmail.com','kill','blocked'),('geet.0988@rediff.com','shyam.t@gmail.com','how are you stupid','blocked'),('geet.0988@rediff.com','tina.roy@yahoo.com','what I','blocked'),('geet.0988@rediff.com','shyam.t@gmail.com','hi.how are you?','posted'),('geet.0988@rediff.com','shyam.t@gmail.com','hi. how are you?','posted'),('geet.0988@rediff.com','shyam.t@gmail.com','hi. how are you?','posted'),('geet.0988@rediff.com','shyam.t@gmail.com','hi....how are you?','posted'),('shyam.t@gmail.com','tina.roy@yahoo.com','you are bitch!','blocked'),('shyam.t@gmail.com','tina.roy@yahoo.com','you are bitch!','blocked'),('shyam.t@gmail.com','tina.roy@yahoo.com','bitch....kill???   now!!...not','blocked'),('shyam.t@gmail.com','tina.roy@yahoo.com','hi.......     how...??? are!!!! you....     ','posted'),('shyam.t@gmail.com','tina.roy@yahoo.com','hi.... how   are ????       you!!!!   ','posted'),('shyam.t@gmail.com','tina.roy@yahoo.com','hi     how..... are    you?????','posted'),('geet.0988@rediff.com','shyam.t@gmail.com','Hi  how are you ya?','posted'),('geet.0988@rediff.com','shyam.t@gmail.com','	Hi... hOw?','posted'),('tina.roy@yahoo.com','geet.0988@rediff.com','hi\r\nHow\r\nArE\r\nYu? ya','posted'),('tina.roy@yahoo.com','geet.0988@rediff.com','hi\r\nHow\r\nArE\r\nYu? ya','posted'),('tina.roy@yahoo.com','geet.0988@rediff.com','hi\r\nare\r\nyou? ya','posted'),('tina.roy@yahoo.com','geet.0988@rediff.com','bitch','posted'),('tina.roy@yahoo.com','geet.0988@rediff.com','pissing off','posted');

/*Table structure for table `frequest` */

DROP TABLE IF EXISTS `frequest`;

CREATE TABLE `frequest` (
  `name` varchar(100) default NULL,
  `req` varchar(100) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `frequest` */

insert into `frequest` (`name`,`req`) values ('tina.roy@yahoo.com','null'),('raj.1992@gmail.com','shyam.t@gmail.com');

/*Table structure for table `friends` */

DROP TABLE IF EXISTS `friends`;

CREATE TABLE `friends` (
  `email` varchar(100) default NULL,
  `friend` varchar(100) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `friends` */

insert into `friends` (`email`,`friend`) values ('geet.0988@rediff.com','shyam.t@gmail.com'),('tina.roy@yahoo.com','geet.0988@rediff.com'),('geet.0988@rediff.com','tina.roy@yahoo.com'),('tina.roy@yahoo.com','rachna.achar@gmail.com'),('rachna.achar@gmail.com','tina.roy@yahoo.com'),('shyam.t@gmail.com','prathi.02@gmail.com'),('prathi.02@gmail.com','shyam.t@gmail.com'),('shyam.t@gmail.com','tina.roy@yahoo.com'),('tina.roy@yahoo.com','shyam.t@gmail.com');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `email` varchar(100) NOT NULL,
  `pass` varchar(50) NOT NULL,
  `fname` varchar(50) default NULL,
  `lname` varchar(50) default NULL,
  `dob` varchar(15) default NULL,
  `gender` varchar(50) default NULL,
  `rstatus` varchar(50) default NULL,
  `religion` varchar(50) default NULL,
  `city` varchar(50) default NULL,
  `hometown` varchar(50) default NULL,
  `politicalview` varchar(50) default NULL,
  `nationality` varchar(50) default NULL,
  `iname` varchar(50) default NULL,
  `iyear` varchar(15) default NULL,
  `cname` varchar(50) default NULL,
  `cyear` varchar(15) default NULL,
  `tolerance` int(11) default '0',
  PRIMARY KEY  (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user` */

insert into `user` (`email`,`pass`,`fname`,`lname`,`dob`,`gender`,`rstatus`,`religion`,`city`,`hometown`,`politicalview`,`nationality`,`iname`,`iyear`,`cname`,`cyear`,`tolerance`) values ('geet.0988@rediff.com','geet','geet','sharma','30.12.98','Female','married','christian','mumbai','bangalore','-','indian','RV college of engineering','2019','oracle','2013',50),('prathi.02@gmail.com','prathi','Prathibha','Prakash','05.01.1998','Female','single','hindu','Bangalore','bangalore',NULL,'Indian','St. Pauls','2003',NULL,NULL,80),('rachna.achar@gmail.com','rachna','Rachna','Acharya','11/10/92','Female','married','muslim','istanbul','las vegas','-','american','Al-ameen institute of technology','1992','Canara bank','1875',0),('raj.1992@gmail.com','raj','raj','sinha','23.10.89','Male','null','null','null','null','null','null','null','null','null','null',0),('shyam.t@gmail.com','shyam','Shyam','T','23.12.93','Male','single','hindu','bangalore','bangalore','-','indian','Bangalore Institute of Technology','2010',NULL,NULL,30),('tina.roy@yahoo.com','tina','tina','roy','11.11.90','Female',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,60);

/*Table structure for table `words` */

DROP TABLE IF EXISTS `words`;

CREATE TABLE `words` (
  `word` varchar(100) NOT NULL,
  `used` varchar(15) default NULL,
  `markedspam` varchar(15) default NULL,
  `spampercentage` int(11) default NULL,
  `markedpolitics` varchar(15) default NULL,
  `politicspercentage` int(11) default NULL,
  `markedabuse` varchar(15) default NULL,
  `abusepercentage` int(11) default NULL,
  `markedviolence` varchar(15) default NULL,
  `violencepercentage` int(11) default NULL,
  PRIMARY KEY  (`word`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `words` */

insert into `words` (`word`,`used`,`markedspam`,`spampercentage`,`markedpolitics`,`politicspercentage`,`markedabuse`,`abusepercentage`,`markedviolence`,`violencepercentage`) values ('a','1','0',0,'0',0,'0',0,'0',0),('AAP','1','0',0,'0',0,'0',0,'0',0),('about','1','0',0,'0',0,'0',0,'0',0),('are','4','0',0,'0',0,'1',20,'0',0),('bad','1','0',0,'1',50,'0',0,'0',0),('bitch','8','1',11,'0',0,'2',22,'2',22),('BJP','3','1',25,'1',25,'0',0,'1',25),('e','1','0',0,'0',0,'0',0,'0',0),('good','2','0',0,'0',0,'0',0,'0',0),('h','2','0',0,'0',0,'0',0,'0',0),('hey','1','0',0,'0',0,'0',0,'0',0),('hi','5','0',0,'0',0,'0',0,'0',0),('how','11','7',58,'0',0,'1',8,'0',0),('i','1','0',0,'0',0,'0',0,'0',0),('idiot','2','0',0,'0',0,'1',33,'1',33),('kill','11','0',0,'0',0,'0',0,'9',75),('killing','1','0',0,'0',0,'0',0,'0',0),('long','1','0',0,'0',0,'0',0,'0',0),('not','2','0',0,'0',0,'0',0,'0',0),('now','1','0',0,'0',0,'0',0,'0',0),('o','2','0',0,'0',0,'0',0,'0',0),('off','6','0',0,'0',0,'2',29,'0',0),('pissing','6','0',0,'0',0,'6',86,'0',0),('r','1','0',0,'0',0,'0',0,'0',0),('should','1','0',0,'0',0,'0',0,'0',0),('stop','1','0',0,'0',0,'1',50,'0',0),('think','1','0',0,'0',0,'0',0,'0',0),('time','1','0',0,'0',0,'0',0,'0',0),('u','1','0',0,'0',0,'0',0,'0',0),('w','1','0',0,'0',0,'0',0,'0',0),('will','2','0',0,'0',0,'0',0,'1',33),('wont','1','0',0,'0',0,'0',0,'0',0),('xxx','3','3',75,'0',0,'0',0,'0',0),('y','1','0',0,'0',0,'0',0,'0',0),('ya','4','0',0,'0',0,'0',0,'0',0),('yo','1','0',0,'0',0,'1',50,'0',0),('you','4','1',20,'0',0,'1',20,'0',0),('youbitch','1','0',0,'0',0,'0',0,'0',0),('yourself','2','0',0,'0',0,'0',0,'1',33),('Yu','2','0',0,'0',0,'0',0,'0',0);

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
