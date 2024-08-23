#! python 
import argparse

# Split a Sentence
# Create a simple function that separates a sentence a list of words
#- Put the function in a file
#- Make the file executable
#- The first parameter should be a sentence
#- If no parameter is given, then an error should be returned
#- If a parameter is given, print out the original sentence and a list containing the words in the sentence

def splitter(sentence):
    
    wordsarray = []
       
    wordsarray = sentence.split(" ")
    return wordsarray

parser = argparse.ArgumentParser(description="Split sentence into array of strings")
parser.add_argument("-t", "--text", dest="sentence", required=True, help="sentence to be split")
args = parser.parse_args()

print("your sentence = ", args.sentence)
print("each word= ", splitter(sentence=args.sentence))

