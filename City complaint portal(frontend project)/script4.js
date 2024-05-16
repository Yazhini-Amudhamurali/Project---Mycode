document.getElementById('loginForm').addEventListener('submit', function(event) {
    event.preventDefault();

    const nameInput = document.getElementById('name');
    const emailInput = document.getElementById('email');
    const passwordInput = document.getElementById('password');

    const name = nameInput.value.trim();
    const email = emailInput.value.trim();
    const password = passwordInput.value.trim();

    const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (name === '') {
        alert('Please enter your name.');
    } else if (!emailPattern.test(email)) {
        alert('Please enter a valid email address.');
    } else if (password === '') {
        alert('Please enter your password.');
    } else {
      
        alert('You are successfully login '+"" + name);
        window.location.href = 'http://127.0.0.1:5500/index5.html';
        
    }
});




