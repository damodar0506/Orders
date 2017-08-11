<?php 
header('Content-Type: application/json');
  //--------------------------------------------------------------------------
  // Example php script for fetching data from mysql database
  //--------------------------------------------------------------------------
  $host = "localhost";
  $user = "root";
  $pass = "1234";
  $databaseName = "restaurent";
 // $tableName = " wap_res_item_master";
  //--------------------------------------------------------------------------
  // 1) Connect to mysql database
  //--------------------------------------------------------------------------
 
  $con = mysql_connect($host,$user,$pass);
  $dbs = mysql_select_db($databaseName, $con);
   $Item_Name = $_REQUEST['Item_Name'];
   $qty = $_REQUEST['qty'];
   
  //--------------------------------------------------------------------------
  // 2) Query database for data
  //--------------------------------------------------------------------------
  $result = mysql_query("select a.Item_ID ,b.Rate  from wap_res_item_master a join  wap_res_item_rates b 
on(a.Item_ID = b.Item_ID) where Item_Name = '$Item_Name'  ; ");          //query
  //$array = mysql_fetch_row($result);                          //fetch result    
  $rows = array();
  while($r = mysql_fetch_assoc($result)) {
    $rows['results'][] = $r;
	
	
  }
 
 
  //--------------------------------------------------------------------------
  // 3) echo result as json 
  //--------------------------------------------------------------------------
  echo json_encode($rows);
?>

 