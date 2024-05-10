
const btn=document.getElementById("post");
btn.addEventListener("click",()=>{
    console.log("hahahahah")
})
const image=sessionStorage.getItem("Image");
const title=sessionStorage.getItem("Title");
const description=sessionStorage.getItem("Description")
const content=sessionStorage.getItem("Content");

document.getElementById("image").src=image;

//const divimg=document.getElementById("divimg");
// divimg.style.backgroundImage="url("+image+")";
// document.getElementById("image").style.backgroundImage = "url("+image+")";


document.getElementById("title").textContent=title;
document.getElementById("description").textContent=description;
document.getElementById("content").textContent=content;