const students = {
    studentName:"Sarthak Agrawal",
    subjectMarks:{
        maths: 40,
        science:60,
        english: 90,
        language: 64,
        moralScience:82
    }
}   

let totalMarks = Object.values(students.subjectMarks).reduce((sum,mark)=>sum + mark, 0);

average = totalMarks / 5;

if (average >= 90 && average <= 100) {
    console.log("Grade: O");
} else if (average >= 70 && average <= 89) {
    console.log("Grade: A");
} else if (average >= 60 && average <= 69) {
    console.log("Grade: B");
} else if (average >= 50 && average <= 59) {
    console.log("Grade: C");
} else {
    console.log("Grade: F");
}

