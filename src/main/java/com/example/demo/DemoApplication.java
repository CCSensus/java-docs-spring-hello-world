package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/")
	
	String sayHello() {
    return "Hello Azure!";
}

<!DOCTYPE html>
<html>
    <head>
        <title>Übung 1.</title>
    </head>
    <body>
<H1> Berechnung der Fallgeschwindigkeit </h1>
        <?php echo"<b> Hallo </b>, diese Webseite dient zur Berechnung der Fallgeschwindigkeit!";?>
<br></br>

<form>
  Gib deine Starthoehe ein: <input name=Starthoehe size=7>
</form>

<?php

$Starthoehe=$_GET ['Starthoehe'];
if (is_numeric($Starthoehe)) echo "<br> Ihre Starthoehe beträgt <b> $Starthoehe Meter! </b> <br>";
else echo "<br> Ihr Angabe ist keine Zahl";
$g = 9.81;
$s = 2;
$counter = 0;
$Ergebnis= $g * $s;
$fallgeschwindigkeit = sqrt($Ergebnis*$Starthoehe) ;
$aufgerundet = ceil ($fallgeschwindigkeit);
$Rfallgeschwindigkeit= sqrt($Ergebnis*$counter) ;
$Raufgerundet = ceil ($Rfallgeschwindigkeit);



echo "<table border=1>";
echo "<br><br>Ihre Aufprallgeschwindigkeit von $Starthoehe Meter betraegt: $aufgerundet m/s" ;




while($Starthoehe>=0) {
$Rfallgeschwindigkeit= sqrt($Ergebnis*$counter) ;
$Raufgerundet = ceil ($Rfallgeschwindigkeit);

if($Starthoehe<1000) {
echo "<tr> <th>$Starthoehe m Fallhoehe </th>";
echo " <th> $Raufgerundet M/s </th>"; 


$counter=$counter+100;
$Starthoehe= $Starthoehe-100;


}

else {

$Rfallgeschwindigkeit= sqrt($Ergebnis*$counter) ;
$Raufgerundet = ceil ($Rfallgeschwindigkeit);



echo "<tr> <th>$Starthoehe m Fallhoehe </th>";
echo " <th> $Raufgerundet M/s </th>"; 


$counter=$counter+500;
$Starthoehe= $Starthoehe-500;


}

}



?>

    </body>
</html>

	}

