import { useEffect } from "react";

function Home(){
    const [products,setProducts] = useState([]);  //Reacti erikood -> muutja HTMLi, funktsioon HtmLi uuendamiseks, algväärtus(tühi massiiv)
    useEffect(()=>{ 
        fetch("http://localhost:8080/products")
            .then(response => response.json())
            .then(body => setProducts(body));
},[]);

   
    return(
        products.map(element => 
        <div>
            <div>{element.name}</div>
            <div>{element.price}</div>
        </div>)
    )
}

export default Home;