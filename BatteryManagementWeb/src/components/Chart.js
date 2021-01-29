import React, { Component } from 'react';
import { Line } from 'react-chartjs-2';

class Chart extends Component {
    constructor(props) {
        super(props);
        this.state = {
            charData: this.props.charData,

        }
    }

    render() {
        return (
            <div >
                <Line
                    data={this.props.charData}
                    height={70}
                    width={200}
                    options={{
                        maintainAspectRatio: true,
                        // scales: {
                        //     yAxes: [{
                        //         ticks: {
                        //             beginAtZero: true
                        //         }

                        //     }]
                        // },
                        title: {
                            display: true,
                            text: 'Voltage vs Current',
                            fontColor: 'blue',
                            fontSize: 20
                        },
                        layout: {
                            padding: {
                                left: 300,
                                right: 300,
                                top: 200,
                                bottom: 0
                            }
                        },
                        legend: {
                            display: false,
                            labels: {
                                fontColor: 'rgb(255, 99, 132)',
                                fontSize: 40
                            }
                        },
                        elements: {
                            line: {
                                tension: 0
                            }
                        },
                        responsive: true,
                        scales: {
                            xAxes: [{
                                //type: 'time',
                                display: true,
                                scaleLabel: {
                                    display: true,
                                    labelString: 'Voltage',
                                    fontSize: 22,
                                    fontColor: 'red',
                                    fontStyle: 'bold'
                                }
                                //     ticks: {
                                //       major: {
                                //         fontStyle: 'bold',
                                //         fontSize:15,
                                //         fontColor: '#FF0000'
                                //       }
                                //     }
                                //  
                            }],
                            yAxes: [{
                                display: true,
                                scaleLabel: {
                                    display: true,
                                    labelString: 'Current',
                                    fontSize: 22,
                                    fontColor: 'red',
                                    fontStyle: 'bold'
                                },
                                ticks: {
                                    beginAtZero: true
                                }

                            }]
                        },
                        tooltips: {
                            mode: 'point',
                            axis: 'x'
                        }
                    }}
                />
            </div>
        )
    }


    
}
export default Chart