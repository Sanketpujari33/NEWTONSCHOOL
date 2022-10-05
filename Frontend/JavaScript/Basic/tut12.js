console.log("Welcome to tut 12.js");
let a = document;
a = document.all;
// a = document.body;
// a = document.forms[0];
// Array.from(a).forEach(function(element){
//     console.log(element);
// })
a = document.links[0];
// use document.images and document.scripts and print the list of images and scripts on an html page

a=document.anchors;
//It will return all <a> elements that have a name attribute


a = document.baseURI;
//It will return the absolute base URI of the document

a = document.body;
//It will return the <body> element
a = document.cookie;
//It will return the document's cookie

a = document.doctype;
// It will return the document's doctype

a = document.documentElement;
// It will return the <html> element

a = document.documentMode;
// It will return the mode used by the browser

a = document.documentURI;
// It will return the URI of the document

a = document.embeds;
// It will return all HTML <embed> elements

a = document.forms;
// It will return all HTML <form> elements

a = document.head;
// It will return the HTML <head> element

a = document.images;
// It will return all HTML <img> elements

a = document.implementation;
// It will return the DOM implementation

a = document.links;
// It will return all HTML <area> and <a> elements that have a href attribute

a = document.scripts;
// It will return all HTML <script> elements

a = document.title;
// It will return the <title> element

a = document.URL;
// It will return the complete URL of the document

console.log(a);
// Note that: The DOM is a representation of the various components of the browser and the current Web document that can be accessed or manipulated using JavaScript.