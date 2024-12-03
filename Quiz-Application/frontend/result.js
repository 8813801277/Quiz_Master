// Function to get the result from localStorage or URL parameters
function displayResult() {
    const score = localStorage.getItem('quizScore'); // Get score from localStorage
    const totalQuestions = localStorage.getItem('totalQuestions'); // Get total questions
    const feedback = document.getElementById('feedback');

    if (score !== null) {
        document.getElementById('score').innerText = `You scored ${score} out of ${totalQuestions}`;
        
        // Optional: Provide feedback based on score
        const percentage = (score / totalQuestions) * 100;
        if (percentage >= 80) {
            feedback.innerText = 'Excellent work! Keep it up!';
        } else if (percentage >= 50) {
            feedback.innerText = 'Good job! You can do even better!';
        } else {
            feedback.innerText = 'Don’t give up! Try again!';
        }
    } else {
        document.getElementById('score').innerText = 'No score available.';
    }
}

async function saveQuiz(quizScore , totalQuestions , feedback) {
    try{
        const response = await fetch('http://localhost:8080/api/saveQuiz', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify({quizScore ,"out of ": totalQuestions , feedback}),
        });

        const data = await response.text();
    }
    catch(error){
        console.error("Error: ",error );
    }
}

// Call the displayResult function when the page loads
window.onload = displayResult;