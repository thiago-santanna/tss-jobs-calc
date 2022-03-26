import Link from 'next/link';
import React from 'react'
import { MdWarningAmber, MdAdd, MdBorderColor, MdOutlineDelete } from "react-icons/md";
import NavBarComponent from '../../components/nav'


const Dashboard = () => {
  return (
    <>
      <NavBarComponent />
      <div className="bg-gray-800 text-white border-t border-gray-200 h-48 md:h-32">
        <div className="container mx-auto">
          <div className="flex flex-row flex-wrap gap-2 md:gap-0 md:space-x-3 justify-center md:justify-between p-2 md:items-end">
            <div>
              <p>12</p>
              <span>Projetos ao total</span>
            </div>
            <div>
              <p>7</p>
              <span>Em andamento</span>
            </div>
            <div>
              <p>4</p>
              <span>Encerrados</span>
            </div>
            <div className="flex flex-row space-x-3 text-center">
              <span><MdWarningAmber size={20} /></span>
              <span>Você tem 2 horas livres no seu dia</span>
            </div>
            <div>
              <Link href="/job" >
                <a className="flex-shrink-0 px-4 py-2 text-base font-semibold text-white bg-purple-600 rounded-lg shadow-md hover:bg-purple-700 focus:outline-none focus:ring-2 focus:ring-purple-500 focus:ring-offset-2 focus:ring-offset-purple-200" type="submit">
                  <MdAdd className="inline-block" /> Adicionar novo Job
                </a>
              </Link>
            </div>
          </div>
        </div>
      </div>

      <div className="container mx-auto -m-8">
        <div className="bg-slate-100 flex flex-col md:flex-row md:space-x-4 md:justify-between items-center p-4 rounded-md mb-4">
          <div className="mb-2">
            <span className="md:mx-4 px-1 text-slate-400 ">1</span>
            <span className="font-bold">Pizzaria Guloso</span>
          </div>

          <div className="mb-2">
            <p className="text-slate-400">Prazo</p>
            <span className="font-light">3 dias pra entrega</span>
          </div>

          <div className="mb-2">
            <p className="text-slate-400">Valor</p>
            <span className="font-light">R$ 4500,00</span>
          </div>

          <div className="bg-green-200 rounded-3xl mb-2 w-40 max-w-xs text-center py-1">
            <span className="text-green-500 font-bold">em andamento</span>
          </div>

          <div className="flex gap-1">
            <div className="border border-slate-300 p-1 rounded-md hover:bg-violet-600 hover:text-white"><MdBorderColor size={20} /></div>
            <div className="border border-slate-300 p-1 rounded-md hover:bg-violet-600 hover:text-white"><MdOutlineDelete size={20} /></div>
          </div>

        </div>

        <div className="bg-slate-100 flex flex-col md:flex-row md:space-x-4 md:justify-between items-center p-4 rounded-md mb-4">
          <div className="mb-2">
            <span className="md:mx-4 px-1 text-slate-400 ">1</span>
            <span className="font-bold">Pizzaria Guloso</span>
          </div>

          <div className="mb-2">
            <p className="text-slate-400">Prazo</p>
            <span className="font-light">3 dias pra entrega</span>
          </div>

          <div className="mb-2">
            <p className="text-slate-400">Valor</p>
            <span className="font-light">R$ 4500,00</span>
          </div>

          <div className="bg-red-200 rounded-3xl w-40 mb-2 max-w-xs text-center py-1">
            <span className="text-red-500 font-bold">Encerrado</span>
          </div>

          <div className="flex gap-1">
            <div className="border border-slate-300 p-1 rounded-md hover:bg-violet-600 hover:text-white"><MdBorderColor size={20} /></div>
            <div className="border border-slate-300 p-1 rounded-md hover:bg-violet-600 hover:text-white"><MdOutlineDelete size={20} /></div>
          </div>
        </div>
      </div>
    </>
  );
}

export default Dashboard;
