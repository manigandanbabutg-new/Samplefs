async function loadMessage(){

    const response = await fetch("/api/hello"); 

    const text = await response.text();

    document.getElementById("output").innerHTML = text;

}
