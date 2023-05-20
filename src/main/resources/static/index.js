    fetch("http://localhost:8080/api/marca_moto", {
            method: "put",
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },

            //make sure to serialize your JSON body
            body: JSON.stringify({
                id: 6,
                alias: "Prueba7",
                marca: "Prueba",
                linea: "Prueba",
                anio: 2023,
                cc: 160
            })
        })
        .then((response) => {
            //do something awesome that makes the world a better place
        })