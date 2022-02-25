<?php

function GenerateToken(){
	date_default_timezone_set("Asia/Kolkata");
	$txt = "". (time() * rand(2,9));
	$txt = (strlen($txt) < 11) ? $txt . rand(2,9) : $txt;
	$alpha = array('x', 'c', 'L', 'b', 'a', 'M', 'q', 'r', 's', 'W');
	
	$x=0;
	$token = "";
	while($x < strlen($txt)){
		$token.= $alpha[(float) substr($txt,$x,1)]; 
		$x++;
	}
	
	return $token;
	
}


echo GenerateToken();
?>
