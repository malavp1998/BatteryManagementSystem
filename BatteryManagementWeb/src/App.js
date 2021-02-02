import { Component } from 'react';
import './App.css';
import Chart from './components/Chart.js'
import 'semantic-ui-css/semantic.min.css'
import { Header, Segment } from 'semantic-ui-react'
import axios from 'axios';

class App extends Component{
  constructor(){
    super()
    this.state={
      voltage:[1,2,3,4,6],
      current:[2,3,53,6,7],
    }
    
  }
  componentDidMount() {

    this.getData();
}

async getData() {
    const url = 'http://localhost:8080/battery/voltage';
    await axios.get(url)
    .then(
        response => {

          response.data.forEach(element => {
            this.setState({current:this.state.current.concat([element.current])})
            this.setState({voltage:this.state.voltage.concat([element.voltage])})
          });
      //       this.setState({
      //       voltage:response.data.volatage,
      //       current:response.data.current,
            
      // })
    })
    .catch(
        error => {
            console.log(error) 
        }
    )
} 
render() {
  const chartData = {
      labels:this.state.voltage,
      datasets:[
          {
              data: this.state.current,
              backgroundColor: [
                'rgba(255, 99, 132, 0.2)',
                'rgba(54, 162, 235, 0.2)',
                'rgba(255, 206, 86, 0.2)',
                'rgba(75, 192, 192, 0.2)',
                'rgba(153, 102, 255, 0.2)',
                'rgba(255, 159, 64, 0.2)'
            ],
            borderColor: [
                'rgba(255, 99, 132, 1)',
                'rgba(54, 162, 235, 1)',
                'rgba(255, 206, 86, 1)',
                'rgba(75, 192, 192, 1)',
                'rgba(153, 102, 255, 1)',
                'rgba(255, 159, 64, 1)'
            ],
            borderWidth: 1
          }
      ],
    
      
  };
  return (
  <div className="App">
   {console.log(this.state.temp)}
  <div >
  <Segment inverted>
        <Header
            as='h1'
            textAlign='center'
        >
            {/* <Image circular size='tiny' src='https://upload.wikimedia.org/wikipedia/commons/2/2d/Tensorflow_logo.svg'/> */}
            BATTERY DATA
        </Header>
    </Segment>
  </div>

    <Chart charData={chartData}/>
  </div>
  )
}
}

export default App;
