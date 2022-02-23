// const fizzBuzz = (n1, n2) => 

const fizzBuzz = (n1, n2) => {
    for (let i = 0; i <= 100; i++) {

        if (i % n1 === 0 && i % n2 != 0) {
            console.log("fizz")
        }
        else if (i % n2 === 0  && i % n1 != 0) {
            console.log("buzz")
        }
        else if (i % n2 === 0 && i % n1 === 0) {
            console.log("fizz buzz")
        }
        else {
            console.log(i)
        }
    }

}

fizzBuzz(2, 5);


