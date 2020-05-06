<?php
	session_start();
	include_once'php/dbh.php';
?>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta http-equiv="X-UA-Compatible" content="ie=edge">
		<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css?family=Roboto:300,900" rel="stylesheet">
		<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
		<link href="css/table.css" rel="stylesheet">
		<link href="css/teams.css" rel="stylesheet">
		<link href="css/pag1.css" rel="stylesheet">
		<script src="js/pg1.js"></script>
		<script src="js/common.js"></script>
          <link rel = "icon" href ="prem_GxM_1.ico" type = "image/x-icon"> 
		<title>PremIEr LEague</title>
    </head>
    <body>
	<div class="navbar">
	   <ul>
			<li><a href="#"><img src="Download-Premier-League-PNG-File.png" class="img"></a></li>
			<li class="ml-auto"><a href="#about"><button>ABOUT</button></a></li>
			<li><a href="#teams"><button>TEAMS</button></a></li>
			<li><a href="#table"><button>TABLE</button></a></li>
			<?php 
			if(isset($_SESSION['id']))
			{	echo'<li><a href="#myteam"><button>MY TEAM</button></a></li>';	
				echo'<li><form action="php/logout.php" method="post"><a><button id="logout" type="submit" name="logout-submit">LOGOUT</button></a></form></li>';
			 
			}
			else 
			{echo'<li><a href="log.html"><button id="login">LOGIN</button></a></li></li>';}
			?>
			<!--<li><a href="javascript:logOut();" id="login">LOGIN</a></li>-->
			<li><a href="contact.html"><button>CONTACT</button></a></li>
			<li><a href='https://www.facebook.com/premierleague/'><i class="fa fa-facebook"></i></a></li>
			<li><a href='https://twitter.com/premierleague'><i class="fa fa-twitter"></i></a></li>
		</ul>
	</div>
	<div class="w3-content" style="max-width:2000px">

  <!-- Automatic Slideshow Images -->
		<div class="mySlides w3-display-container w3-center">
		<img src="stadiums/anfield.jpg" style="width:100%">
			<div class="w3-display-bottommiddle w3-container w3-text-white w3-padding-32 w3-hide-small">
				<h3>Anfield</h3>
				<p><b>Anfield Rd, Anfield, Liverpool L4 0TH, Regatul Unit</b></p>   
			</div>
		</div>
		<div class="mySlides w3-display-container w3-center">
		<img src="stadiums/oldtraf.jpg" style="width:100%">
			<div class="w3-display-bottommiddle w3-container w3-text-white w3-padding-32 w3-hide-small">
				<h3>Old Trafford</h3>
				<p><b>Sir Matt Busby Way, Trafford Park, Stretford, Manchester M16 0RA, Regatul Unit</b></p>   
			</div>
		</div>
		<div class="mySlides w3-display-container w3-center">
		<img src="stadiums/afc.jpg" style="width:100%">
			<div class="w3-display-bottommiddle w3-container w3-text-white w3-padding-32 w3-hide-small">
				<h3>Vitality Stadium</h3>
				<p><b>Boscombe, Bournemouth BH7 7AF, Regatul Unit</b></p>   
			</div>
		</div>
		<div class="mySlides w3-display-container w3-center">
		<img src="stadiums/albion.jpg" style="width:100%">
			<div class="w3-display-bottommiddle w3-container w3-text-white w3-padding-32 w3-hide-small">
				<h3>Amex Stadium</h3>
				<p><b>Village Way, Brighton BN1 9BL, Regatul Unit</b></p>   
			</div>
		</div>
		<div class="mySlides w3-display-container w3-center">
		<img src="stadiums/arsenal.jpg" style="width:100%">
			<div class="w3-display-bottommiddle w3-container w3-text-white w3-padding-32 w3-hide-small">
				<h3>Emirates Stadium</h3>
				<p><b>Hornsey Rd, London N7 7AJ, Regatul Unit</b></p>   
			</div>
		</div>
			<div class="mySlides w3-display-container w3-center">
		<img src="stadiums/chelsea.jpg" style="width:100%">
			<div class="w3-display-bottommiddle w3-container w3-text-white w3-padding-32 w3-hide-small">
				<h3>Stamford Bridge</h3>
				<p><b>Fulham Rd, Fulham, London SW6 1HS, Regatul Unit</b></p>   
			</div>
		</div>
		<div class="mySlides w3-display-container w3-center">
		<img src="stadiums/burnley.jpg" style="width:100%">
			<div class="w3-display-bottommiddle w3-container w3-text-white w3-padding-32 w3-hide-small">
				<h3>Turf Moor</h3>
				<p><b>52-56 Harry Potts Way, Burnley BB10 4BX, Regatul Unit</b></p>   
			</div>
		</div>
		<div class="mySlides w3-display-container w3-center">
		<img src="stadiums/everton.jpg" style="width:100%">
			<div class="w3-display-bottommiddle w3-container w3-text-white w3-padding-32 w3-hide-small">
				<h3>Goodison Park</h3>
				<p><b>Goodison Rd, Liverpool L4 4EL, Regatul Unit</b></p>   
			</div>
		</div>
		<div class="mySlides w3-display-container w3-center">
		<img src="stadiums/leicester.jpg" style="width:100%">
			<div class="w3-display-bottommiddle w3-container w3-text-white w3-padding-32 w3-hide-small">
				<h3>King Power Stadium</h3>
				<p><b>Filbert Way, Leicester LE2 7FL, Regatul Unit</b></p>   
			</div>
		</div>
		<div class="mySlides w3-display-container w3-center">
		<img src="stadiums/palace.jpg" style="width:100%">
			<div class="w3-display-bottommiddle w3-container w3-text-white w3-padding-32 w3-hide-small">
				<h3>Selhurst Park</h3>
				<p><b>Selhurst; Londra, SE25; Regatul Unit</b></p>   
			</div>
		</div>
		<div class="mySlides w3-display-container w3-center">
		<img src="stadiums/watford.jpg" style="width:100%">
			<div class="w3-display-bottommiddle w3-container w3-text-white w3-padding-32 w3-hide-small">
				<h3>Vicarage Road</h3>
				<p><b>Vicarage Road, Watford WD18 0ER, Regatul Unit</b></p>   
			</div>
		</div>
		<div class="mySlides w3-display-container w3-center">
		<img src="stadiums/saints.jpg" style="width:100%">
			<div class="w3-display-bottommiddle w3-container w3-text-white w3-padding-32 w3-hide-small">
				<h3>St Mary Stadium</h3>
				<p><b>Britannia Road, Southampton SO14 5FP, Regatul Unit</b></p>   
			</div>
		</div>
		<div class="mySlides w3-display-container w3-center">
		<img src="stadiums/mancestercity.jpg" style="width:100%">
			<div class="w3-display-bottommiddle w3-container w3-text-white w3-padding-32 w3-hide-small">
				<h3>Etihad</h3>
				<p><b>Ashton New Rd, Manchester M11 3FF, Manchester, Regatul Unit</b></p>   
			</div>
		</div>
		<div class="mySlides w3-display-container w3-center">
		<img src="stadiums/Villa_Park.jpg" style="width:100%">
			<div class="w3-display-bottommiddle w3-container w3-text-white w3-padding-32 w3-hide-small">
				<h3>Villa Park</h3>
				<p><b>Trinity Road, Birmingham B6 6HE, Regatul Unit</b></p>   
			</div>
		</div>
		<div class="mySlides w3-display-container w3-center">
		<img src="stadiums/sheffield.jpg" style="width:100%">
			<div class="w3-display-bottommiddle w3-container w3-text-white w3-padding-32 w3-hide-small">
				<h3>Bramall Lane</h3>
				<p><b>Bramall Lane, Sheffield S2 4SU, Bramall Lane</b></p>   
			</div>
		</div>
		<div class="mySlides w3-display-container w3-center">
		<img src="stadiums/newcastle.jpg" style="width:100%">
			<div class="w3-display-bottommiddle w3-container w3-text-white w3-padding-32 w3-hide-small">
				<h3>St James Park</h3>
				<p><b>The Storeyard Horse, Guards Road, London SW1A 2BJ, Regatul Unit</b></p>   
			</div>
		</div>
		<div class="mySlides w3-display-container w3-center">
		<img src="stadiums/norwich.jpeg" style="width:100%">
			<div class="w3-display-bottommiddle w3-container w3-text-white w3-padding-32 w3-hide-small">
				<h3>Carrow Road</h3>
				<p><b>Carrow Road, Norwich NR1 1JE, Regatul Unit</b></p>   
			</div>
		</div>
		<div class="mySlides w3-display-container w3-center">
		<img src="stadiums/spurs.jpg" style="width:100%">
			<div class="w3-display-bottommiddle w3-container w3-text-white w3-padding-32 w3-hide-small">
				<h3>Tottenham Hotspur Stadium</h3>
				<p><b>Bill Nicholson Way, 748 High Road, Tottenham, London N17 0AP, Regatul Unit</b></p>   
			</div>
		</div>
		<div class="mySlides w3-display-container w3-center">
		<img src="stadiums/wes.jpg" style="width:100%">
			<div class="w3-display-bottommiddle w3-container w3-text-white w3-padding-32 w3-hide-small">
				<h3>London Stadium</h3>
				<p><b>Queen Elizabeth Olympic Park, Stratford, London E20 2ST, Regatul Unit</b></p>   
			</div>
		</div>
		<div class="mySlides w3-display-container w3-center">
		<img src="stadiums/wolves.jpg" style="width:100%">
			<div class="w3-display-bottommiddle w3-container w3-text-white w3-padding-32 w3-hide-small">
				<h3>Molineux Stadium</h3>
				<p><b>Waterloo Road, Wolverhampton WV1 4QR, Regatul Unit</b></p>   
			</div>
		</div>
	<!-- ABOUT-->	
		<div class="w3-container w3-content w3-center w3-padding-64" style="max-width:800px" id="about">
			<h2 class="w3-wide">ABOUT</h2>
			<p class="w3-center"><b>Premier League</b></p><br>
			<p class="w3-justify">The Premier League, often referred to as the English Premier League or the EPL outside England,
			is the top level of the English football league system. Contested by 20 clubs, it operates on a system of promotion and relegation with the English Football League (EFL). 
			Seasons run from August to May with each team playing 38 matches (playing all 19 other teams both home and away). Most games are played on Saturday and Sunday afternoons.
			</p></br>
			<p class="w3-justify">
			The competition was founded as the FA Premier League on 20 February 1992 following the decision of clubs in the Football League First Division to break away from the Football 
			League, founded in 1888, and take advantage of a lucrative television rights deal. The deal was worth around £1 billion a year domestically as of 2013–14, with Sky and BT Group
			securing the domestic rights to broadcast 116 and 38 games respectively. The league is a corporation in which the member clubs act as shareholders, and generates €2.2 billion per
			year in domestic and international television rights. Clubs were apportioned central payment revenues of £2.4 billion in 2016–17, with a further £343 million in solidarity payments
			to English Football League (EFL) clubs.</p>	<br>
			<p class="w3-justify">
			The Premier League is the most-watched sports league in the world, broadcast in 212 territories to 643 million homes and a potential TV audience of 4.7 billion people. For the 2018–19
			season average Premier League match attendance was at 38,181, second to the Bundesliga's 43,500, while aggregated attendance across all matches is the highest of any league at 14,508,981.
			Most stadium occupancies are near capacity. The Premier League ranks second in the UEFA coefficients of leagues based on performances in European competitions over the past five seasons as 
			of 2019, only behind Spain's La Liga.
			</p>
		</div>
	<!-- TEAMS -->
	
	<div class="teams" id="teams">
	<div class="w3-container w3-content w3-padding-64" style="max-width:800px">
	<h2 class="w3-wide w3-center">TEAMS</h2>
	<p class="w3-opacity w3-center"><i>Premier League Clubs</i></p><br>
      <div class="w3-row-padding w3-padding-32 " style="margin:0 -16px">
        <div class="w3-third w3-margin-bottom " id="Arsenal">
          <img src="stadiums/arsenal.jpg" alt="Arsenal" style="width:100%" class="w3-hover-opacity">
          <div class="w3-container arsenal">
            <p style="color:white"><b>Arsenal</b></p>
            <p style="color:white">Emirates stadium</p><br>
            <button class="w3-button w3-red w3-margin-bottom" onclick=" window.open('http://www.arsenal.com')">Go To website</button>
          </div>
        </div>
        <div class="w3-third w3-margin-bottom">
          <img src="stadiums/Villa_Park.jpg" alt="Aston Villa" style="width:100%" class="w3-hover-opacity">
          <div class="w3-container villa">
            <p style="color:white"><b>Aston Villa</b></p>
            <p style="color:white">Villa Park</p><br>
            <button class="w3-button w3-black w3-margin-bottom" onclick="window.open('http://www.avfc.co.uk')">Go To website</button>
          </div>
        </div>
        <div class="w3-third w3-margin-bottom" >
          <img src="stadiums/afc.jpg" alt="AFC Bournemouth" style="width:100%" class="w3-hover-opacity">
          <div class="w3-container afc">
            <p style="color:white"><b>AFC Bournemouth</b></p>
            <p style="color:white">Vitality Stadium</p><br>
            <button class="w3-button w3-black w3-margin-bottom" onclick="window.open('http://www.afcb.co.uk')">Go To website</button>
          </div>
        </div>
		<div class="w3-third w3-margin-bottom">
          <img src="stadiums/albion.jpg" alt="Albion" style="width:100%" class="w3-hover-opacity">
          <div class="w3-container albion">
            <p style="color:white"><b>Brighton and Hove Albion</b></p>
            <p style="color:white">Amex stadium</p><br>
            <button class="w3-button w3-blue w3-margin-bottom" onclick="window.open('http://www.brightonandhovealbion.com')">Go To website</button>
          </div>
        </div>
        <div class="w3-third w3-margin-bottom">
          <img src="stadiums/burnley.jpg" alt="Burnley" style="width:100%" class="w3-hover-opacity">
          <div class="w3-container villa">
            <p style="color:white"><b>Burnley</b></p>
            <p style="color:white">Turf Moor</p><br>
            <button class="w3-button w3-black w3-margin-bottom" onclick="window.open('http://www.burnleyfootballclub.com')">Go To website</button>
          </div>
        </div>
        <div class="w3-third w3-margin-bottom" >
          <img src="stadiums/chelsea.jpg" alt="Chelsea" style="width:100%" class="w3-hover-opacity">
          <div class="w3-container chelsea">
            <p style="color:white"><b>Chelsea</b></p>
            <p style="color:white">Stamford Bridge</p><br>
            <button class="w3-button w3-blue w3-margin-bottom" onclick="window.open('http://www.chelseafc.com')">Go To website</button>
          </div>
        </div>
		  <div class="w3-third w3-margin-bottom">
          <img src="stadiums/palace.jpg" alt="Crystal Palace" style="width:100%" class="w3-hover-opacity">
          <div class="w3-container palace">
            <p style="color:white"><b>Crystal Palace</b></p>
            <p style="color:white">Selhurst Park</p><br>
            <button class="w3-button w3-red w3-margin-bottom" onclick="window.open('http://www.cpfc.co.uk')">Go To website</button>
          </div>
        </div>
        <div class="w3-third w3-margin-bottom">
          <img src="stadiums/everton.jpg" alt="Everton" style="width:100%" class="w3-hover-opacity">
          <div class="w3-container everton">
            <p style="color:white"><b>Everton</b></p>
            <p style="color:white">Goodison Park</p><br>
            <button class="w3-button w3-blue w3-margin-bottom" onclick="window.open('http://www.evertonfc.com')">Go To website</button>
          </div>
        </div>
        <div class="w3-third w3-margin-bottom" >
          <img src="stadiums/leicester.jpg" alt="Leicester" style="width:100%" class="w3-hover-opacity">
          <div class="w3-container leicester">
            <p style="color:gold"><b>Leicester</b></p>
            <p style="color:gold">King Power Stadium</p><br>
            <button class="w3-button w3-blue w3-margin-bottom" onclick="window.open('http://www.lcfc.com')">Go To website</button>
          </div>
        </div>
		 <div class="w3-third w3-margin-bottom">
          <img src="stadiums/anfield.jpg" alt="Liverpool" style="width:100%" class="w3-hover-opacity">
          <div class="w3-container liverpool">
            <p style="color:gold"><b>Liverpool</b></p>
            <p style="color:gold">Anfield</p><br>
            <button class="w3-button w3-red w3-margin-bottom" onclick="window.open('http://www.liverpoolfc.com')">Go To website</button>
          </div>
        </div>
        <div class="w3-third w3-margin-bottom">
          <img src="stadiums/mancestercity.jpg" alt="Manchester City" style="width:100%" class="w3-hover-opacity">
          <div class="w3-container city">
            <p style="color:white"><b>Manchester City</b></p>
            <p style="color:white">Etihad</p><br>
            <button class="w3-button w3-blue w3-margin-bottom" onclick="window.open('http://www.mancity.com')">Go To website</button>
          </div>
        </div>
        <div class="w3-third w3-margin-bottom" >
          <img src="stadiums/oldtraf.jpg" alt="Manchester United" style="width:100%" class="w3-hover-opacity">
          <div class="w3-container united">
            <p style="color:yellow"><b>Manchester United</b></p>
            <p style="color:yellow">Old Trafford</p><br>
            <button class="w3-button w3-black w3-margin-bottom" onclick="window.open('http://www.manutd.com')">Go To website</button>
          </div>
        </div>
		<div class="w3-third w3-margin-bottom">
          <img src="stadiums/newcastle.jpg" alt="Newcastle United" style="width:100%" class="w3-hover-opacity">
          <div class="w3-container w3-black">
            <p style="color:gold"><b>Newcastle United</b></p>
            <p style="color:gold">St James Park</p><br>
            <button class="w3-button w3-gray w3-margin-bottom" onclick="window.open('http://www.nufc.co.uk')">Go To website</button>
          </div>
        </div>
        <div class="w3-third w3-margin-bottom">
          <img src="stadiums/norwich.jpeg" alt="Norwich City" style="width:100%" class="w3-hover-opacity">
          <div class="w3-container w3-green">
            <p style="color:yellow"><b>Norwich City</b></p>
            <p style="color:yellow">Carrow Road</p><br>
            <button class="w3-button w3-yellow w3-margin-bottom" onclick="window.open('http://www.canaries.co.uk')">Go To website</button>
          </div>
        </div>
        <div class="w3-third w3-margin-bottom" >
          <img src="stadiums/sheffield.jpg" alt="Sheffield United" style="width:100%" class="w3-hover-opacity">
          <div class="w3-container sheffield">
            <p style="color:white"><b>Sheffield United</b></p>
            <p style="color:white">Bramall Lane</p><br>
            <button class="w3-button w3-black w3-margin-bottom" onclick="window.open('http://www.sufc.co.uk')">Go To website</button>
          </div>
        </div>
		  <div class="w3-third w3-margin-bottom">
          <img src="stadiums/saints.jpg" alt="Southampton" style="width:100%" class="w3-hover-opacity">
          <div class="w3-container saints">
            <p style="color:white"><b>Southampton</b></p>
            <p style="color:white">St Mary Stadium</p><br>
            <button class="w3-button w3-red w3-margin-bottom" onclick="window.open('http://www.southamptonfc.com')">Go To website</button>
          </div>
        </div>
        <div class="w3-third w3-margin-bottom">
          <img src="stadiums/spurs.jpg" alt="Tottenham Hotspur" style="width:100%" class="w3-hover-opacity">
          <div class="w3-container spurs">
            <p style="color:white"><b>Tottenham Hotspur</b></p>
            <p style="color:white">Tottenham Hotspur Stadium</p><br>
            <button class="w3-button w3-white w3-margin-bottom" onclick="window.open('http://www.tottenhamhotspur.com')">Go To website</button>
          </div>
        </div>
        <div class="w3-third w3-margin-bottom" >
          <img src="stadiums/watford.jpg" alt="Watford" style="width:100%" class="w3-hover-opacity">
          <div class="w3-container watford">
            <p style="color:black"><b>Watford</b></p>
            <p style="color:black">Vicarage Road</p><br>
            <button class="w3-button w3-red w3-margin-bottom" onclick="window.open('http://watfordfc.com')">Go To website</button>
          </div>
        </div>
		<div class="w3-third w3-margin-bottom">
          <img src="stadiums/wes.jpg" alt="West Ham" style="width:100%" class="w3-hover-opacity">
          <div class="w3-container westham">
            <p style="color:white"><b>West Ham</b></p>
            <p style="color:white">London Stadium</p><br>
            <button class="w3-button w3-blue w3-margin-bottom" onclick="window.open('http://www.whufc.com')">Go To website</button>
          </div>
        </div>
        <div class="w3-third w3-margin-bottom" >
          <img src="stadiums/wolves.jpg" alt="Wolverhampton" style="width:100%" class="w3-hover-opacity">
          <div class="w3-container wolves">
            <p style="color:black"><b>Wolverhampton Wanderers</b></p>
            <p style="color:black">Molineux Stadium</p><br>
            <button class="w3-button w3-black w3-margin-bottom" onclick="window.open('http://www.wolves.co.uk')">Go To website</button>
          </div>
        </div>
        </div>
      </div>
    </div>
		<!-- Standing-->
		<div class="table">
		<div class="w3-container w3-content w3-center w3-padding-64" style="max-width:800px" id="table">
			<h2 class="w3-wide">STANDING</h2>
			<p class="w3-center"><b>Premier League</b></p><br>
			<div class="ptable">
							<table>
						<tr class="col">
							<th>#</th>
							<th>Team</th>
							<th>GP</th>
							<th>W</th>
							<th>D</th>
							<th>L</th>
							<th>GD</th>
							<th>PTS</th>
						</tr>
						<tr class="col-winner">
							<td>1</td>
							<td>Liverpool FC</td>
							<td>29</td>
							<td>27</td>
							<td>1</td>
							<td>1</td>
							<td>+45</td>
							<td>88</td>
						</tr>
						<tr class="wpos">
							<td>2</td>
							<td>Manchester City</td>
							<td>28</td>
							<td>18</td>
							<td>3</td>
							<td>7</td>
							<td>+37</td>
							<td>57</td>
						</tr>
						<tr class="wpos">
							<td>3</td>
							<td>Leicester City</td>
							<td>29</td>
							<td>16</td>
							<td>5</td>
							<td>8</td>
							<td>+30</td>
							<td>53</td>
						</tr>
						<tr class="wpos">
							<td>4</td>
							<td>Chelsea</td>
							<td>29</td>
							<td>14</td>
							<td>6</td>
							<td>9</td>
							<td>+12</td>
							<td>48</td>
						</tr>
						<tr class="wpos" style="border-top: 1px solid #38003c">
							<td>5</td>
							<td>Manchester United</td>
							<td>29</td>
							<td>12</td>
							<td>9</td>
							<td>8</td>
							<td>+14</td>
							<td>48</td>
						</tr>
						<tr class="wpos">
							<td>6</td>
							<td>Wolverhampton Wanderers</td>
							<td>29</td>
							<td>10</td>
							<td>13</td>
							<td>6</td>
							<td>+7</td>
							<td>43</td>
						</tr>
						<tr class="wpos" style="border-top: 1px solid #38003c">
							<td>7</td>
							<td>Sheffield United</td>
							<td>28</td>
							<td>11</td>
							<td>10</td>
							<td>7</td>
							<td>+5</td>
							<td>43</td>
						</tr>
						<tr class="wpos">
							<td>8</td>
							<td>Tottenham Hotspur</td>
							<td>29</td>
							<td>11</td>
							<td>8</td>
							<td>10</td>
							<td>+7</td>
							<td>41</td>
						</tr>
						<tr class="wpos">
							<td>9</td>
							<td>Arsenal</td>
							<td>28</td>
							<td>9</td>
							<td>13</td>
							<td>6</td>
							<td>+4</td>
							<td>40</td>
						</tr>
						<tr class="wpos">
							<td>10</td>
							<td>Burnley</td>
							<td>29</td>
							<td>11</td>
							<td>6</td>
							<td>12</td>
							<td>-6</td>
							<td>39</td>
						</tr>
						<tr class="wpos">
							<td>11</td>
							<td>Crystal Palace</td>
							<td>29</td>
							<td>10</td>
							<td>9</td>
							<td>10</td>
							<td>-6</td>
							<td>39</td>
						</tr>
						<tr class="wpos">
							<td>12</td>
							<td>Everton</td>
							<td>29</td>
							<td>10</td>
							<td>7</td>
							<td>12</td>
							<td>-9</td>
							<td>37</td>
						</tr>
						<tr class="wpos">
							<td>13</td>
							<td>Newcastle United</td>
							<td>29</td>
							<td>9</td>
							<td>8</td>
							<td>12</td>
							<td>-16</td>
							<td>35</td>
						</tr>
						<tr class="wpos">
							<td>14</td>
							<td>Southampton</td>
							<td>29</td>
							<td>10</td>
							<td>4</td>
							<td>15</td>
							<td>-17</td>
							<td>34</td>
						</tr>
						<tr class="wpos">
							<td>15</td>
							<td>Brighton and Hove Albion</td>
							<td>29</td>
							<td>6</td>
							<td>11</td>
							<td>12</td>
							<td>-8</td>
							<td>29</td>
						</tr>
						<tr class="wpos">
							<td>16</td>
							<td>West Ham United</td>
							<td>29</td>
							<td>7</td>
							<td>6</td>
							<td>16</td>
							<td>-15</td>
							<td>27</td>
						</tr>
						<tr class="wpos">
							<td>17</td>
							<td>Watford</td>
							<td>29</td>
							<td>6</td>
							<td>9</td>
							<td>14</td>
							<td>-17</td>
							<td>27</td>
						</tr>
						<tr class="pos" style="border-top: 1px solid #38003c">
							<td>18</td>
							<td>AFC Bournemouth</td>
							<td>29</td>
							<td>7</td>
							<td>6</td>
							<td>16</td>
							<td>-18</td>
							<td>27</td>
						</tr>
						<tr class="pos">
							<td>19</td>
							<td>Aston Villa</td>
							<td>28</td>
							<td>7</td>
							<td>4</td>
							<td>17</td>
							<td>-22</td>
							<td>25</td>
						</tr>
						<tr class="pos">
							<td>20</td>
							<td>Norwich City</td>
							<td>29</td>
							<td>5</td>
							<td>6</td>
							<td>18</td>
							<td>-27</td>
							<td>21</td>
						</tr>	
					</table>
			</div>
	
		</div>
		</div>
		<!-- My Team-->	
		<?php 
			if(isset($_SESSION['id']))
			{
				$sql="SELECT * from teams where name='".$_SESSION['team']."'";
				$result=mysqli_query($conn,$sql);
				$row=mysqli_fetch_assoc($result);
				echo'
			<div class="teams" id="myteam">
			<div class="w3-container w3-content w3-center w3-padding-64" style="max-width:800px">
			<h2 class="w3-wide">MY TEAM</h2>
			<p class="w3-center"><b>'.$_SESSION['team'].'</b></p><br>
			 <p class="w3-justify">'.$row['description'].'</p><br>
			 <div class="w3-row w3-padding-32">
			 ';
				$sql="SELECT * from players where team='".$_SESSION['team']."'";
				$result=mysqli_query($conn,$sql);
				$resultCheck=mysqli_num_rows($result);
				if($resultCheck>0){
					echo '<p class="w3-center"><b>Top Players this season:</b></p><br>';
				while($row=mysqli_fetch_assoc($result))
					{
						echo '
							  <div class="w3-third">
								<h3>'.$row['name'].'</h3>
								<img src="players/'.$row['picture'].'" class="w3-round" alt="Random Name" style="width:60%">
								<h4>Goals:'.$row['goals'].'</h4>
								<p>Assists:'.$row['assists'].'</p>								
							 </div>';
					}
				}
			echo'
			  </div>
			</div>
			</div>';
			}?>
	
  </div>
  
  
		<script>
// Automatic Slideshow - change image every 4 seconds
var myIndex = 0;
carousel();
</script>
   </body>
</html>