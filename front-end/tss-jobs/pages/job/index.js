import React, { useState, useEffect } from 'react';
import NavForm from '../../components/nav-form';
import { MdMonetizationOn, MdRecycling } from "react-icons/md";

const Job = () => {
  const [job, setJob] = useState({
    nome: "",
    empresaSolicitante: "",
    descricao: "",
    horasDia: 0,
    horasEstimadaJob: "",
    valorEstimadoJob: 0,
    userId: "cd267792-d843-4544-9150-7797e98fa536"
  })

  const salvar = async () => {
    try {
      const response = await fetch('http://localhost:8080/jobs', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(job)
      })
      const data = await response.json()
      alert("Projeto criado com sucesso", data.nome)
    } catch (error) {

    }

  }

  const atualizainputs = evt => {
    const value = evt.target.value
    const key = evt.target.name
    setJob(old => ({ ...old, [key]: value }))
  }

  return (
    <>
      <NavForm title="Job" />
      <div className="container mx-auto">
        <div className="grid grid-cols-1 md:grid-rows-1 md:grid-cols-2 md:gap-4 md:mt-2 mx-2">
          <div>
            <h1 className="font-bold text-2xl mb-4 text-center mt-1">Dados do Job</h1>
            <div className=" md:mb-2">
              <p className="font-light">Nome do Job</p>
              <input name="nome" onChange={atualizainputs} type="text" id="&quot;form-subscribe-Subscribe" className=" rounded-lg border-transparent flex-1 appearance-none border border-gray-300 w-full py-2 px-4 bg-white text-gray-700 placeholder-gray-400 shadow-sm text-base focus:outline-none focus:ring-2 focus:ring-purple-600 focus:border-transparent" placeholder="Fazer micro serviço" />
            </div>

            <div className=" md:mb-2">
              <p className="font-light">Descrição do job</p>
              <input name="descricao" onChange={atualizainputs} type="text" id="&quot;form-subscribe-Subscribe" className=" rounded-lg border-transparent flex-1 appearance-none border border-gray-300 w-full py-2 px-4 bg-white text-gray-700 placeholder-gray-400 shadow-sm text-base focus:outline-none focus:ring-2 focus:ring-purple-600 focus:border-transparent" placeholder="Fazer um micro serviço para pegar o papa-léguas" />
            </div>

            <div className=" md:mb-2">
              <p className="font-light">Empresa solicitante</p>
              <input name="empresaSolicitante" onChange={atualizainputs} type="text" id="&quot;form-subscribe-Subscribe" className=" rounded-lg border-transparent flex-1 appearance-none border border-gray-300 w-full py-2 px-4 bg-white text-gray-700 placeholder-gray-400 shadow-sm text-base focus:outline-none focus:ring-2 focus:ring-purple-600 focus:border-transparent" placeholder="Empresas ACME" />
            </div>

            <div className=" md:mb-2">
              <p className="font-light">Valor do Job</p>
              <input name="valorEstimadoJob" onChange={atualizainputs} type="number" id="&quot;form-subscribe-Subscribe" className=" rounded-lg border-transparent flex-1 appearance-none border border-gray-300 w-full py-2 px-4 bg-white text-gray-700 placeholder-gray-400 shadow-sm text-base focus:outline-none focus:ring-2 focus:ring-purple-600 focus:border-transparent" placeholder="550,00" />
            </div>

            <div>
              <div className=" md:mb-2">
                <p className="font-light">Quantas horas
                  por dia vai dedicar ao Job?</p>
                <input name="horasDia" onChange={atualizainputs} type="number" id="&quot;form-subscribe-Subscribe" className=" rounded-lg border-transparent flex-1 appearance-none border border-gray-300 w-full py-2 px-4 bg-white text-gray-700 placeholder-gray-400 shadow-sm text-base focus:outline-none focus:ring-2 focus:ring-purple-600 focus:border-transparent" placeholder="10" />
              </div>

              <div className=" md:mb-2">
                <p className="font-light">Estimativa de
                  horas para esse job</p>
                <input name="horasEstimadaJob" onChange={atualizainputs} type="number" id="&quot;form-subscribe-Subscribe" className=" rounded-lg border-transparent flex-1 appearance-none border border-gray-300 w-full py-2 px-4 bg-white text-gray-700 placeholder-gray-400 shadow-sm text-base focus:outline-none focus:ring-2 focus:ring-purple-600 focus:border-transparent" placeholder="10" />
              </div>
            </div>
          </div>

          <div className="md:justify-between bg-white mt-4 flex flex-col items-center gap-4">
            <MdMonetizationOn size="80" />

            <p className="md:text-2xl">O valor do projeto ficou em
              <span className="font-bold pl-2">R$ 4,576.00 reais</span>
            </p>

            <div className="flex flex-row gap-2 mb-3 text-center  md:justify-between">
              <button onClick={salvar} className="flex-shrink-0 px-4 py-2 text-base font-semibold text-white bg-purple-600 rounded-lg shadow-md hover:bg-purple-700 focus:outline-none focus:ring-2 focus:ring-purple-500 focus:ring-offset-2 focus:ring-offset-purple-200" type="submit">
                Salvar Dados
              </button>

              <button type="submit">
                <MdRecycling size={32} />
              </button>
            </div>
          </div>
        </div>
      </div>
    </>
  );
}

export default Job;
