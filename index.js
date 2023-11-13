const bar = document.getElementById('barChart');
const pie = document.getElementById('pieChart');
const line = document.getElementById('lineChart');

let coisas = ["Segurança", "Luz", "Internet", "Água Publica", "Esgoto"]
let valoresCoisas = [10, 20, 15, 30, 50]
new Chart(bar, {
    type: 'bar',
    data: {
        labels: coisas,
        datasets: [{
        label: 'Quantidade de escolas que possuem:',
        data: valoresCoisas,
        borderWidth: 5
        }]
    },
    options: {
        options: {
            responsive: true
        },
        layout: {
          padding: {
            left: 20,
            right: 20,
            top: 20,
            bottom: 20,
          },
        },
        maintainAspectRatio: false, 
    }
});

let profissionalismo = ['Norte', 'Nordeste', 'Centro-Oeste', 'Sul', 'Suldeste'] 
let valoresProf = [12, 19, 3, 5, 2]
new Chart(pie, {
    type: 'doughnut',
    data: {
        labels: profissionalismo,
        datasets: [{
        label: 'Quantidade de escolas por região:',
        data: valoresProf,
        borderWidth: 5
        }]
    },
    options: {
        options: {
            responsive: true
        },
        layout: {
          padding: {
            left: 20,
            right: 20,
            top: 20,
            bottom: 20,
          },
        },
        maintainAspectRatio: false, 
    }
});

let mes = ["Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"]
let valoresMes = [10, 20, 15, 30, 50, 98, 30, 25, 32, 57, 22, 10]

new Chart(line, {
    type: 'line',
    data: {
        labels: mes,
        datasets: [{
        label: 'Variação de escolas com entrega regular de alimentos:',
        data: valoresMes,
        borderWidth: 5
        }]
    },
    options: {
        layout: {
          padding: {
            left: 20,
            right: 20,
            top: 20,
            bottom: 20,
          },
        },
        maintainAspectRatio: false, 
        responsive: true
    }
});
