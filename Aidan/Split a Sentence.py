#! python 

# Split a Sentence
# Create a simple function that separates a sentence a list of words
#- Put the function in a file
#- Make the file executable
#- The first parameter should be a sentence
#- If no parameter is given, then an error should be returned
#- If a parameter is given, print out the original sentence and a list containing the words in the sentence

def splitter(sentence):
    wordsarray = []
    
    if sentence == []:
        print("Please enter a sentence!")
        return
    
    wordsarray = sentence.split(" ")
    return wordsarray


input1 = "This right here is a sentence"
var = splitter(input1)
print("You provided this function with" + input1 + ". Here's what we split this into:" + var)