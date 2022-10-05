console.log("This is tutorial 30");

//forEach
//filter
//map
//sort
//reduce

const companies = [
    { name: "Google", category: "Product Base", start: 1981, end: 2004 },
    { name: "Amazon", category: "Product Base", start: 1992, end: 2008 },
    { name: "Paytm", category: "Product Base", start: 1999, end: 2007 },
    { name: "Coforge", category: "Service Based", start: 1989, end: 2010 },
    { name: "Mindtree", category: "Service Based", start: 1989, end: 2010 },
];

const ages = [33, 12, 20, 16, 5, 54, 21, 44, 61, 13, 15, 45, 25, 64, 32];

// normal loop

// for (let index = 0; index < companies.length; index++) {
//     console.log(companies[index]);
    
// }

//forEach
// companies.forEach(function(company, index){
//   console.log(company.name);
// });

// companies.forEach((company, index)=>{
// console.log(company.category);
// });
// companies.forEach((company, index) => console.log(index));

// companies.forEach((company, index) => console.log(company.start));

// companies.forEach((company, index) => console.log(company.end));

//Normal Filter

// for (let index = 0; index < ages.length; index++) {
//     if(ages[index]>=20)
//     {console.log( ages[index])}
// }

//Filter
// const age=ages.filter((age)=>{
//     if(age>=30){
//         return true;
//     }
// })
// console.log(age);


// const finalAge=ages.filter((age)=> age>=30);
// console.log(finalAge);


// const ps = companies.filter((company) =>company.category === "Product Base");
// console.log(ps);


// const sb=companies.filter((company)=> {
// if (company.category === "Service Based") {
//   return true;
// }})
// console.log(sb);



//map

// const dummy = companies.map((company,index)=>{
//   return `${index}-${company.name}-${company.category}-${company.start}-${company.end}`;
// })
// console.log(dummy);


// Sort

// const sortCompanies = companies.sort((c1,c2)=>{
//   if(c1.start>c2.start){
//     return 1;
//   }else{
//     return -1;
//   }
// })
// console.log(sortCompanies);



// const sortCompanies = companies.sort((c1, c2) =>c1.start > c2.start ? 1 : -1);
// console.log(sortCompanies);

// const sortCompanies = ages.sort((a, b) =>(a-b));
// console.log(sortCompanies);



//reduce

let total=0;
for (let index = 0; index < ages.length; index++) {
  total+=ages[index];
}
console.log(total);



// const sumage=ages.reduce((total, age)=>{
//     return total+age;
// })
// console.log(sumage);

const sumage = ages.reduce((total, age) => total + age, 0);
console.log(sumage);