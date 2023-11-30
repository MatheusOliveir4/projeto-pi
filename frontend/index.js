document.getElementById('csvFile').addEventListener('change', readFile)

const bar = document.getElementById('barChart');
const pie = document.getElementById('pieChart');
const line = document.getElementById('lineChart');

function readFile(e) {
  const file = e.target.files[0]

  if (!file) {
    return;
  }

  parseCSV(file)
}

async function parseCSV(file) {
  await Papa.parse(file, {
    header: true,
    dynamicTyping: true,
    complete: function (results) {

      showGraphs(results.data) 
    },
  });
}


function showGraphs(data) {
  const neighborhoods = data.map(el => {
    for (const key in el) {
      if (key === 'NO_BAIRRO') {
        return el[key]
      }
    }
  })

  const numSchoolsInNeighboorhood = data.map(el => {
    for (const key in el) {
      if (key === 'QTD_ESCOLAS') {
        return el[key]
      }
    }
  }) 

  createGraph('bar', 'Quantidade de escolas que possuem:', neighborhoods, numSchoolsInNeighboorhood, barChart)
  createGraph('pie', 'Quantidade de escolas que possuem:', neighborhoods, numSchoolsInNeighboorhood, pieChart)
  createGraph('line', 'Quantidade de escolas que possuem:', neighborhoods, numSchoolsInNeighboorhood, lineChart)
}

function createGraph(type, lableTitle, labels, data, element) {
  new Chart(element, {
    type,
    data: {
      labels,
      datasets: [{
        label: lableTitle,
        data,
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
  })
}
