USE `timelinedb`;
CREATE TABLE `event` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `startdate` varchar(30) NOT NULL,
  `enddate` varchar(30) NOT NULL,
  `caption` varchar(128) NOT NULL,
  `desc` text,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
