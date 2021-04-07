const promise = fetch("https://pokeapi.co/api/v2/pokemon/1");
// une promesse d execution propose deux parametre l un est effectuer et l autre résout un potentiel probelme
const promise2 = new Promise(resolve, reject) => {
    setTimeout(()=>{
        resolve("OK");
    }, 1000);
    resove = 42;
});

console.log(promise);



// effectuer quand la promise est terminer j ai unefullfilled avec le resultat qui returne la prmmesse d appel réseau
// avec un json de mon resultat

// ici on résout le resultat avec un résultat json du fetch et ensuite on peut la return
promise.then((result)=>{
   return result.json();
});

/// fonction de parsing basique
function parseJSON(result){
    return result.json();
}







promise.catch(()=>{

});