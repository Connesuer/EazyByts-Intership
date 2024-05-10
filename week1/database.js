const { MongoClient } = require('mongodb')
const client = new MongoClient('mongodb://localhost:27017/eazyb/')

async function run(){
    try{
        
const d=client.db("eazyb");
const coll=d.collection("interndata");
const data={"name":"child","age":12};
const a=coll.insertOne(data);
const show=coll.find()
for await (const a of show){
    console.log(a)
}
}
finally{
    await client.close();
}
}
run().catch(console.dir);

//--------------------