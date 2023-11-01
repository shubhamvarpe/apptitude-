function reverseWords(sentence) {
    return sentence.split(' ').map(word => word.split('').reverse().join('')).join(' ');
}

const inputSentence = "This is a sunny day in javascript";
const reversedSentence = reverseWords(inputSentence);

console.log(reversedSentence);
