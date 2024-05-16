document.getElementById('loginForm').addEventListener('submit', function(event) {
    event.preventDefault(); 

    const nameInput = document.getElementById('name');
    const emailInput = document.getElementById('email');
    const confirmEmailInput = document.getElementById('confirmEmail');
    const passwordInput = document.getElementById('password');
    const confirmPasswordInput = document.getElementById('confirmPassword');
    const phoneInput = document.getElementById('phone');
    const genderInput = document.getElementById('gender');
    const districtInput = document.getElementById('district');
    

    const name = nameInput.value.trim();
    const email = emailInput.value.trim();
    const confirmEmail = confirmEmailInput.value.trim();
    const password = passwordInput.value.trim();
    const confirmPassword = confirmPasswordInput.value.trim();
    const phone = phoneInput.value.trim();
    const gender = genderInput.value.trim();
    const district = districtInput.value.trim();
   

    
    if (email !== confirmEmail) {
        alert('Emails do not match. Please re-enter.');
        return;
    }

    
    if (password !== confirmPassword) {
        alert('Passwords do not match. Please re-enter.');
        return;
    }

      
        alert('You Are Successfully Registered '+ name);
        window.location.href = 'http://127.0.0.1:5500/index5.html';
        
    
});
 

    
   