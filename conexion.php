<?php
class conexion{

function recuperarDatos(){
$host = "localhost:3306";
$user = "demobye";
$pw= "";
$db ="demobye_prueba";


 $con = mysql_connect($host, $user, $pw) or die ("no se pudo conectar a la base de datos ");
mysql_select_db($db,$con) or die (no se encontro la base de datos);
$query ="Select * from test";
mysql_query(query);
$resultado = nysql_query($query);

while ($fila = mysql_fetch_array($resultado)){
echo "$fila[nombre]<br>";
echo "$fila[telefono]<br>";

}


}
}
?>
	
