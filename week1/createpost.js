// var dispimg=document.getElementById("dispimg")
// var loadfile=function(event){
//     dispimg.style.backgroundImage="url("+URL.createObjectURL(event.target.files[0]) +")";
// }

var img=document.getElementById("image")
imgholder=""
img.addEventListener("change",()=>{
    const r=new FileReader();
    r.addEventListener("load",()=>{
        imgholder=r.result
        document.getElementById("dispimg").style.backgroundImage=`url(${imgholder})`
    })
    r.readAsDataURL(event.target.files[0])
})


const form=document.getElementById("form");
const title=document.getElementById("title");
const description=document.getElementById("description");
const content=document.getElementById("content");



form.addEventListener("submit",(e)=>{
    e.preventDefault();
    sessionStorage.setItem("Image",imgholder);
sessionStorage.setItem("Title",title.value);
sessionStorage.setItem("Description",description.value);
sessionStorage.setItem("Content",content.value);
window.location.href="blogs.html"
// async function run(){
//     try{
        
// const d=client.db("eazyb");
// const coll=d.collection("interndata");
// const data={"image":imgholder,"title":title.value,"content":content.value};
// const a=coll.insertOne(data);
// const show=coll.find()
// for await (const a of show){

//     console.log(a)
// }
// }
// finally{
//     await client.close();
// }
// }
// run().catch(console.dir);
})


const { MongoClient } = require('mongodb')
const client = new MongoClient('mongodb://localhost:27017/eazyb/')