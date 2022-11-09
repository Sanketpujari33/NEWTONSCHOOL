// JS destructuring?
    var o = {p: 42, q: true};
     var {p, q} = o;


      var o = { key : "value" };
      var { key : local_var } = o ;
      local_var === o["key"] // true


      var p =  o["p"] ;  //42
       var q = o["q"];   //true
       var a = o["a"];  // undefined
       var b = o["b"];   //undefined
//write code which return the array that contains two values, maximum height and weight among the two objects JS destructuring?
var groupBy = function(xs, key) {
  return xs.reduce(function(rv, x) {
    (rv[x[key]] = rv[x[key]] || []).push(x);
    return rv;
  }, {});
};

console.log(groupBy(['one', 'two', 'three'], 'length'));

// => {"3": ["one", "two"], "5": ["three"]}

//write code which return the array that contains two values, maximum height and weight among the two objects JS destructuring?
const data = [{
    "id": 101,
    "title": {
      "rendered": "CTC20180018"
    },
    "acf": {
      "fielda": "valuea",
      "fieldb": "valueb",
      "fieldc": "valuec"
    }
  },
  {
    "id": 102,
    "title": {
      "rendered": "D2021063365"
    },
    "acf": {
      "fielda": "valuea",
      "fieldb": "valueb",
      "fieldc": "valuec"
    }
  }
]

const result = data.map(({
  id,
  title,
  acf
}) => ({
  id: id,
  title: title.rendered,
  ...acf
}));

console.log(result);

