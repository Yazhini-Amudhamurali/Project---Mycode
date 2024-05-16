document.getElementById('loginForm').addEventListener("submit", function(event) {
    event.preventDefault(); 

    const nameInput = document.getElementById('name');
    const wardInput = document.getElementById('ward');
    const areaInput = document.getElementById('area');
    const cityInput = document.getElementById('city');
    const districtInput = document.getElementById('district');
    const pinInput = document.getElementById('pin');
    const phoneInput = document.getElementById('phone');
    const descripInput = document.getElementById('descrip');
    

    const name = nameInput.value.trim();
    const ward = wardInput.value.trim();
    const area = areaInput.value.trim();
    const city = cityInput.value.trim();
    const district = districtInput.value.trim();
    const pin = pinInput.value.trim();
    const phone = phoneInput.value.trim();
    const descrip = descripInput.value.trim();
   
   
   
        alert(name + 'Your Complaint  Registered ');
        window.location.href = 'http://127.0.0.1:5500/index.html';
    
    
});
 