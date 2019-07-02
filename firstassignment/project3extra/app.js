var name = window.prompt("Enter your name: ");
if (name === "" || name === "null"){
	name = "generic user";
}
document.getElementById("name").innerHTML = name;