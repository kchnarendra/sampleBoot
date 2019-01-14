create database narendraTestDB;

CREATE TABLE `agentstest` (
  `id` int(11) NOT NULL,
  `fName` varchar(45) DEFAULT NULL,
  `lName` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;




http://localhost:9095/sample/insertuser

    {
    	 "id": 9,
        "firstName": "kkkk",
        "lastName": "singh"
    }
	
	
http://localhost:9095/sample/getallusers
	