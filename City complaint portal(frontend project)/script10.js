document.getElementById('loginForm').addEventListener("submit", function(event) {
    event.preventDefault(); 
    const nameInput = document.getElementById('name');
    const districtInput = document.getElementById('district');
    const descripInput = document.getElementById('descrip');



    const name = nameInput.value.trim();
    const district = districtInput.value.trim();
    const descrip = descripInput.value.trim();

    alert(name +" " +'Thanks For Your Feedback! ');
    window.location.href = 'http://127.0.0.1:5500/index1.html';


});
