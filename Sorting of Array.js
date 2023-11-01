const arr = [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5];

// Using the sort() method with a custom compare function
arr.sort(function(a, b) {
    return b - a;
});

console.log(arr);
